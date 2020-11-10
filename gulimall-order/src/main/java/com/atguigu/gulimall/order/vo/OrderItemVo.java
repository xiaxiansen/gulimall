package com.atguigu.gulimall.order.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.order.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-20 10:37
 */
@Data
public class OrderItemVo {
    private Long skuId;
    private String title;
    private String image;
    private List<String> skuAttr;
    private BigDecimal price;
    private Integer count;
    private BigDecimal totalPrice;
    private boolean hasStock;
    private BigDecimal weight;
}
