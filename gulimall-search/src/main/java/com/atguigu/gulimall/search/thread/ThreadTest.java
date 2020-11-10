package com.atguigu.gulimall.search.thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: gulimall -- com.atguigu.gulimall.search.thread
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-12 21:33
 */
public class ThreadTest {
    public static ExecutorService executor = Executors.newFixedThreadPool(10);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("main.....start.....");
//        CompletableFuture.runAsync(()->{
//            System.out.println("当前线程: "+Thread.currentThread().getId());
//            int i = 10 /2;
//            System.out.println("运行结果: "+i);
//        },executor);
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("当前线程: " + Thread.currentThread().getId());
//            int i = 10 / 0;
//            System.out.println("运行结果: " + i);
//            return i;
//        }, executor).whenComplete((res,exception)->{
//            //虽然能得到异常信息,但是没法修改返回数据
//            System.out.println("异步任务成功完成了....结果是: "+res+";异常是:"+exception);
//        }).exceptionally(throwable -> {
//            //可以感知异常,同时返回默认值
//            return 10;
//        });
//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("当前线程: " + Thread.currentThread().getId());
//            int i = 10 / 0;
//            System.out.println("运行结果: " + i);
//            return i;
//        }, executor).handle((res,thr)->{
//            if(res != null){
//                return res * 2;
//            }
//            if(thr != null){
//                return 0;
//            }
//            return 0;
//        });
//        Integer integer = future.get();
//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("当前线程: " + Thread.currentThread().getId());
//            int i = 10 / 5;
//            System.out.println("运行结果: " + i);
//            return i;
//        }, executor).thenRunAsync(() -> {
//            System.out.println("任务2启动了....");
//        }, executor);
        // thenRunAsync:不能接受上一步结果，无返回值
        // thenAcceptAsync:能接受上一步结果，但是无返回值
        //
//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("当前线程: " + Thread.currentThread().getId());
//            int i = 10 / 5;
//            System.out.println("运行结果: " + i);
//            return i;
//        }, executor).thenAcceptAsync(res -> {
//            System.out.println("任务2启动了...."+res);
//        }, executor);
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("当前线程: " + Thread.currentThread().getId());
//            int i = 10 / 5;
//            System.out.println("运行结果: " + i);
//            return i;
//        }, executor).thenApplyAsync(res -> {
//            System.out.println("任务2启动了...." + res);
//            return "Hello" + res;
//        }, executor);
//        String s = future.get();
        //两个都完成
//        CompletableFuture<Object> future01 = CompletableFuture.supplyAsync(() -> {
//            System.out.println("任务1线程: " + Thread.currentThread().getId());
//            int i = 10 / 5;
//            System.out.println("任务1结束:");
//            return i;
//        }, executor);
//        CompletableFuture<Object> future02 = CompletableFuture.supplyAsync(() -> {
//            System.out.println("任务2线程: " + Thread.currentThread().getId());
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("任务2结束:");
//            return "hello";
//        }, executor);
//        future01.runAfterBothAsync(future02, ()->{
//            System.out.println("任务3开始....");
//        },executor);
//        future01.thenAcceptBothAsync(future02,(f1, f2)->{
//            System.out.println("任务3开始....之前的结果: "+f1+"--->>"+f2);
//        },executor);
//        CompletableFuture<String> future = future01.thenCombineAsync(future02, (f1, f2) -> {
//            return f1 + ": " + f2 + " -> hahaha";
//        }, executor);
        /* 两个任务，只要有一个完成,我们就执行任务
        *   runAfterEitherAsync: 不能感知前任务结果,无返回值
        *   acceptEitherAsync: 能感知前任务结果,无返回值
        *   applyToEitherAsync:能感知前任务结果,有返回值
        * */
//        future01.runAfterEitherAsync(future02, ()->{
//            System.out.println("任务3开始");
//        },executor);
//        future01.acceptEitherAsync(future02, (res)->{
//            System.out.println("任务3开始.....之前的结果："+res);
//        },executor);
//        CompletableFuture<String> future = future01.applyToEitherAsync(future02, (res) -> {
//            System.out.println("任务3开始.....之前的结果："+res);
//            return res.toString() + "-->哈哈";
//        }, executor);
        CompletableFuture<String> futureImg = CompletableFuture.supplyAsync(() -> {
            System.out.println("查询商品的图片信息");
            return "hello.jpg";
        }, executor);
        CompletableFuture<String> futureAttr = CompletableFuture.supplyAsync(() -> {
            System.out.println("查询商品的属性信息");
            return "黑色 + 256G";
        }, executor);
        CompletableFuture<String> futureDesc = CompletableFuture.supplyAsync(() -> {
            System.out.println("查询商品介绍");
            return "华为";
        }, executor);
//        CompletableFuture<Void> allOf = CompletableFuture.allOf(futureImg, futureAttr, futureDesc);
        CompletableFuture<Object> anyOf = CompletableFuture.anyOf(futureImg, futureAttr, futureDesc);

//        allOf.get();
        anyOf.get();
//        System.out.println("main.......end........"+futureImg.get()+"-->"+futureAttr.get()+"-->"+futureDesc.get());
        System.out.println("main.......end........"+anyOf.get());
    
    }
}
