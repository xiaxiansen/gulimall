package com.atguigu.gulimall.ware.vo;

import lombok.Data;

/**
 * @program: gulimall -- com.atguigu.gulimall.ware.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-09-15 15:44
 */
@Data
public class PurchaseItemDoneVo {
    private Long itemId;
    private Integer status;
    private String reason;
}
