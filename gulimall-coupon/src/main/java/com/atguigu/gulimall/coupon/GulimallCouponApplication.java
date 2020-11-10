package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: gulimall -- com.atguigu.gulimall.coupon
 * @description: TODO
 * @author: xia liang
 * @create: 2020-09-14 16:33
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {
    public static void main(String[] args) {
            SpringApplication.run(GulimallCouponApplication.class, args);
    }
}
