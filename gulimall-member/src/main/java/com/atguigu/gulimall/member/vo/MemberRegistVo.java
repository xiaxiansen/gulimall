package com.atguigu.gulimall.member.vo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @program: gulimall -- com.atguigu.gulimall.member.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-15 11:09
 */
@Data
public class MemberRegistVo {
    private String userName;
    private String password;
    private String phone;
}
