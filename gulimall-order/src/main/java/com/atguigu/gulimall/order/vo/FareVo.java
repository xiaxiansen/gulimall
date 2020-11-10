package com.atguigu.gulimall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: gulimall -- com.atguigu.gulimall.ware.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-20 21:58
 */
@Data
public class FareVo {
    private MemberAddressVo address;
    private BigDecimal fare;
}
