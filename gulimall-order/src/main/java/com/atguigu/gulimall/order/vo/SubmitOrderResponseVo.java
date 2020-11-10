package com.atguigu.gulimall.order.vo;

import com.atguigu.gulimall.order.entity.OrderEntity;
import lombok.Data;

/**
 * @program: gulimall -- com.atguigu.gulimall.order.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-22 11:31
 */
@Data
public class SubmitOrderResponseVo {
    private OrderEntity order;
    //0 成功 错误状态码
    private Integer code;
}
