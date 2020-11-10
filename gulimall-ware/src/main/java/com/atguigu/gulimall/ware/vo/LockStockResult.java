package com.atguigu.gulimall.ware.vo;

import lombok.Data;

/**
 * @program: gulimall -- com.atguigu.gulimall.ware.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-22 16:59
 */
@Data
public class LockStockResult {
    private Long skuId;
    private Integer num;
    private Boolean locked;
}
