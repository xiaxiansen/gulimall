package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @program: gulimall -- com.atguigu.gulimall.product.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-09-13 11:07
 */
@Data
public class AttrRespVo extends AttrVo{
    private String catelogName;
    private String groupName;
    private Long[] catelogPath;
}
