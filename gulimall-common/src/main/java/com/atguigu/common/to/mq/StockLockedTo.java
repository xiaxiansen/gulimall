package com.atguigu.common.to.mq;

import lombok.Data;

import java.util.List;

/**
 * @program: gulimall -- com.atguigu.common.to.mq
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-23 20:05
 */
@Data
public class StockLockedTo {
    //库存工作单的id
    private Long id;
    //工作详情
    private StockDetailTo detail;
}
