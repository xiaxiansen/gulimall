package com.atguigu.gulimall.order.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.temporal.Temporal;

/**
 * @program: gulimall -- com.atguigu.gulimall.order.config
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-20 15:33
 */
@Configuration
public class GuliFeignConfig {
    @Bean("requestInterceptor")
    public RequestInterceptor requestInterceptor(){
        return new RequestInterceptor() {
            @Override
            public void apply(RequestTemplate requestTemplate) {
                //1.RequestInterceptor 拿到刚进来的请求
                ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                if(attributes != null){
                    //老请求
                    HttpServletRequest request = attributes.getRequest();
                    if(request != null){
                        //同步请求头数据 Cookie
                        String cookie = request.getHeader("Cookie");
                        //给新请求同步了老请求的cookie
                        requestTemplate.header("Cookie", cookie);
                    }
                }
            }
        };
    }
}
