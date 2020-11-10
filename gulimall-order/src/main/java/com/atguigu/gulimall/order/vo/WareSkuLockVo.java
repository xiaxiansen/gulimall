package com.atguigu.gulimall.order.vo;

import lombok.Data;

import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.order.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-22 16:41
 */
@Data
public class WareSkuLockVo {
    //订单号
    private String orderSn;
    //需要锁住的所有库存信息
    private List<OrderItemVo> locks;
}
