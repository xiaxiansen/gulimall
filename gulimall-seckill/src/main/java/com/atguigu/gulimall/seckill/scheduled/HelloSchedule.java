package com.atguigu.gulimall.seckill.scheduled;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @program: gulimall -- com.atguigu.gulimall.seckill.scheduled
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-27 09:57
 */
@Slf4j
@Component
//@EnableAsync
//@EnableScheduling
public class HelloSchedule {
    @Async
//    @Scheduled(cron = "* * * ? * 2")
    public void hello() throws InterruptedException {
        log.info("hello....");
        Thread.sleep(3000);
    }
}
