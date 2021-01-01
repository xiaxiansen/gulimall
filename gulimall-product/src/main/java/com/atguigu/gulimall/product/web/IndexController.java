package com.atguigu.gulimall.product.web;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import com.atguigu.gulimall.product.vo.Catelog2Vo;
import org.redisson.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @program: gulimall -- com.atguigu.gulimall.product.web
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-05 17:46
 */
@Controller
public class IndexController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    RedissonClient redisson;
    @Autowired
    private StringRedisTemplate redisTemplate;
    @GetMapping({"/","/index.html"})
    public String indexPage(Model model){
        //TODO 1、查出所有的 1 级分类
        List<CategoryEntity> categoryEntities = categoryService.getLevel1Categorys();
        model.addAttribute("categorys",categoryEntities);
        return "index";
    }
    @ResponseBody
    @GetMapping("/index/catalog.json")
    public Map<String, List<Catelog2Vo>> getCatalogJson(){
        Map<String, List<Catelog2Vo>> map = categoryService.getCatalogJson();
        return map;
    }
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        //1.获取一把锁，只要锁的名字一样，就是同一把锁
        RLock lock = redisson.getLock("my-lock");
        //2.加锁
//        lock.lock();//阻塞式等待,默认加的锁都是 30s时间
        lock.lock(30, TimeUnit.SECONDS);//10秒自动解锁，自动解锁时间一定要大于业务的执行时间
        //1)、锁的自动续期，如果业务超长，运行期间自动给锁续上新的30s，不用担心业务时间长,锁自动过期被删掉
        //2)、加锁的业务只要运行完成，就不会给当前锁续期，即使不手动解锁，锁默认在 30s以后自动删除
        try {
            System.out.println("加锁成功，执行业务..."+Thread.currentThread().getId());
            Thread.sleep(30000);
        } catch (Exception e){
        
        } finally{
            //3.解锁
            System.out.println("释放锁..."+Thread.currentThread().getId());
            lock.unlock();
        }
        return "hello";
    }
    //保证一定能读到最新数据，修改期间，写锁是一个排他锁(互斥锁，独享)，读锁是一个共享锁
    // 读 + 读 相当于无锁
    // 写 + 读 等待写锁释放
    // 写 + 写 阻塞方式
    // 读 + 写 有读锁，写也要等待
    //只要有写的存在，都必须等待
    //保证一定能读到最新数据，修改期间，写锁是一个排他锁(互斥锁),读锁是一个共享锁
    //写锁没释放读就必须等待
    @GetMapping("/write")
    @ResponseBody
    public String writeValue(){
        RReadWriteLock lock = redisson.getReadWriteLock("rw-lock");
        RLock rLock = lock.writeLock();
        String s = "";
        try {
            //1.改数据加写锁,读数据加读锁
            rLock.lock();
            s = UUID.randomUUID().toString();
            Thread.sleep(10000);
            redisTemplate.opsForValue().set("writeValue", s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            rLock.unlock();
        }
        return s;
    }
    @GetMapping("/read")
    @ResponseBody
    public String readValue(){
        RReadWriteLock lock = redisson.getReadWriteLock("rw-lock");
        RLock rLock = lock.readLock();
        String s = "";
        rLock.lock();
        try {
            s = redisTemplate.opsForValue().get("writeValue");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            rLock.unlock();
        }
        return s;
    }
    //闭锁
    //等五个班的人都走了再锁门
    @GetMapping("/lockDoor")
    @ResponseBody
    public String lockDoor() throws InterruptedException {
        RCountDownLatch door = redisson.getCountDownLatch("door");
        door.trySetCount(5);
        door.await();
        return "放假锁门了...";
    }
    @GetMapping("/gogogo/{id}")
    @ResponseBody
    public String gogogo(@PathVariable("id")Long id){
        RCountDownLatch door = redisson.getCountDownLatch("door");
        door.countDown();//计数减一
        return id+"班的人都走了...";
    }
    /*信号量
    * 车库 停车
    * 3个车位
    * */
    @GetMapping("/park")
    @ResponseBody
    public String park() throws InterruptedException {
        RSemaphore park = redisson.getSemaphore("park");
        boolean b = park.tryAcquire();//获取一个信号，获取一个值，占一个车位
        if(b){
            //执行业务
            return "ok=>"+b;
        }else {
            return "error=>"+b;
        }
        
    }
    @GetMapping("/go")
    @ResponseBody
    public String go() throws InterruptedException {
        System.out.println("11111111111111111");
        System.out.println("hello git");
        RSemaphore park = redisson.getSemaphore("park");
        park.release();//释放一个车位
        System.out.println("是多久啊极大");
        System.out.println("22222222222222");
        return "ok";
    }
}
