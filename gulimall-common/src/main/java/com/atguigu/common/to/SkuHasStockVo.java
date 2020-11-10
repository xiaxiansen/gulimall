package com.atguigu.common.to;

import lombok.Data;

/**
 * @program: gulimall -- com.atguigu.gulimall.ware.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-04 10:32
 */
@Data
public class SkuHasStockVo {
    private Long skuId;
    private Boolean hasStock;
}
