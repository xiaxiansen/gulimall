package com.atguigu.gulimall.cart.vo;

import lombok.Data;

/**
 * @program: gulimall -- com.atguigu.gulimall.cart.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-18 11:30
 */
@Data
public class UserInfoTo {
    private Long userId;
    private String userKey;
    private boolean tempUser = false;
}
