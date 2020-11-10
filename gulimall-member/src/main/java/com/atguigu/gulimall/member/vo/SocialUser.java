package com.atguigu.gulimall.member.vo;

import lombok.Data;

/**
 * @program: gulimall -- com.atguigu.gulimall.auth.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-16 10:33
 */
@Data
public class SocialUser {
    private String access_token;
    private String remind_in;
    private long expires_in;
    private String uid;
    private String isRealName;
}
