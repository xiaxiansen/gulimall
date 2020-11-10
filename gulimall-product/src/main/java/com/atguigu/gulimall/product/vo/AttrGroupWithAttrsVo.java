package com.atguigu.gulimall.product.vo;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.atguigu.gulimall.product.entity.AttrGroupEntity;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.product.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-09-14 10:46
 */
@Data
public class AttrGroupWithAttrsVo extends AttrGroupEntity {

    private Long attrGroupId;

    private String attrGroupName;

    private Integer sort;

    private String descript;

    private String icon;

    private Long catelogId;
    
    private List<AttrEntity> attrs;
}
