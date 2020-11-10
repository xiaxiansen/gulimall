package com.atguigu.gulimall.product.vo;

import lombok.Data;

import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.product.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-13 12:34
 */
@Data
public class SpuItemAttrGroupVo {
    private String groupName;
    private List<Attr> attrs;
}
