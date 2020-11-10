package com.atguigu.gulimall.product.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * @program: gulimall -- com.atguigu.gulimall.product.config
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-07 18:57
 */
@Configuration
public class MyRedissionConfig {
    @Bean(destroyMethod="shutdown")
    public RedissonClient redisson() throws IOException {
        //1.创建配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.85.130:6379");
        //2.根据 Config 创建出 RedissonClient实例
        RedissonClient redissonClient = Redisson.create(config);
        return redissonClient;
    }
}
