package com.atguigu.common.to.mq;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: gulimall -- com.atguigu.common.to.mq
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-28 10:17
 */
@Data
public class SeckillOrderTo {
    //订单号
    private String orderSn;
    //活动场次id
    private Long promotionSessionId;
    //商品Id
    private Long skuId;
    //秒杀价格
    private BigDecimal seckillPrice;
    //购买数量
    private Integer num;
    //会员id
    private Long memberId;
}
