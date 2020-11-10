package com.atguigu.gulimall.ware.vo;

import lombok.Data;

import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.ware.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-09-15 11:24
 */
@Data
public class MergeVo {
    private Long purchaseId; //整单id
    private List<Long> items;
}
