package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: gulimall -- com.atguigu.common.to
 * @description: TODO
 * @author: xia liang
 * @create: 2020-09-14 17:33
 */
@Data
public class SpuBoundTo {
    private Long spuId;
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
}
