package com.atguigu.gulimall.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//@SpringBootTest
class GulimallCouponApplicationTests {

    @Test
    void contextLoads() {
//        LocalDate now = LocalDate.now();
//        LocalDate plus = now.plusDays(1);
//        LocalDate plus2 =now.plusDays(2);
//        System.out.println(now);
//        System.out.println(plus);
//        System.out.println(plus2);
//        LocalTime min = LocalTime.MIN;
//        LocalTime max = LocalTime.MAX;
//        System.out.println(min);
//        System.out.println(max);
//        LocalDateTime start = LocalDateTime.of(now, min);
//        LocalDateTime end = LocalDateTime.of(plus2, max);
//        System.out.println(start);
//        System.out.println(end);
        LocalDate now = LocalDate.now();
        LocalTime min = LocalTime.MIN;
        LocalDateTime start = LocalDateTime.of(now, min);
        String format = start.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format);
    }
    
}
