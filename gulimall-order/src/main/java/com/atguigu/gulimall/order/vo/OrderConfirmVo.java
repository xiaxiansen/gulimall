package com.atguigu.gulimall.order.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: gulimall -- com.atguigu.gulimall.order.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-20 10:43
 */
/** 订单确认需要的数据 */
public class OrderConfirmVo {
    //收货地址: ums_member_receive_address 表
    @Setter @Getter
    List<MemberAddressVo> address;
    //所有选中的购物项
    @Setter @Getter
    List<OrderItemVo> items;
    //优惠券信息...
    @Setter @Getter
    Integer integration;
    //防重令牌
    @Setter @Getter
    String orderToken;
    @Setter @Getter
    Map<Long,Boolean> stocks;
    //订单总额
//    BigDecimal total;
    public Integer getCount(){
        Integer i = 0;
        if(items != null){
            for (OrderItemVo item : items) {
                i+=item.getCount();
            }
        }
        return i;
    }
    public BigDecimal getTotal() {
        BigDecimal sum = new BigDecimal("0");
        if(items !=null){
            for (OrderItemVo item : items) {
                BigDecimal multiply = item.getPrice().multiply(new BigDecimal(item.getCount().toString()));
                sum = sum.add(multiply);
            }
        }
        return sum;
    }
    
    //应付价格
//    BigDecimal payPrice;
    
    public BigDecimal getPayPrice() {
        return getTotal();
    }
}
