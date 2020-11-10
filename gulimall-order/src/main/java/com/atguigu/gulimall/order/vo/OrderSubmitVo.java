package com.atguigu.gulimall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: gulimall -- com.atguigu.gulimall.order.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-22 10:36
 */
@Data
public class OrderSubmitVo {
    //收货地址id
    private Long addrId;
    //支付方式
    private Integer payType;
    //无需提交需要购买的商品,去购物车再获取一遍
    //防重令牌
    private String orderToken;
    //应付价格,验价
    private BigDecimal payPrice;
    //订单备注
    private String note;
    //用户相关信息,直接从session中取出相关用户
}
