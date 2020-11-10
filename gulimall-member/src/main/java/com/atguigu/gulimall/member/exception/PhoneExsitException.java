package com.atguigu.gulimall.member.exception;

/**
 * @program: gulimall -- com.atguigu.gulimall.member.exception
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-15 11:29
 */
public class PhoneExsitException extends RuntimeException {
    public PhoneExsitException() {
        super("手机号存在");
    }
}
