package com.atguigu.gulimall.order.vo;

import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

/**
 * @program: gulimall -- com.atguigu.gulimall.order.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-20 17:23
 */
@Data
public class SkuStockVo {
    private Long skuId;
    private Boolean hasStock;
}
