package com.atguigu.gulimall.member.exception;

/**
 * @program: gulimall -- com.atguigu.gulimall.member.exception
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-15 11:29
 */
public class UserNameExistException extends RuntimeException {
    public UserNameExistException() {
        super("用户名存在");
    }
}
