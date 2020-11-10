package com.atguigu.gulimall.product.vo;

import com.atguigu.gulimall.product.entity.SkuImagesEntity;
import com.atguigu.gulimall.product.entity.SkuInfoEntity;
import com.atguigu.gulimall.product.entity.SpuInfoDescEntity;
import lombok.Data;

import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.product.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-13 10:37
 */
@Data
public class SkuItemVo {
    //1. sku基本信息 pms_sku_info
    SkuInfoEntity info;
    boolean hasStock = true;
    //2. sku的图片信息 pms_sku_images
    List<SkuImagesEntity> images;
    //3. 获取 spu 的销售属性组合
    List<SkuItemSaleAttrVo> saleAttr;
    //4. 获取 spu 的介绍
    SpuInfoDescEntity desp;
    //5. 获取 spu 的规格参数信息
    List<SpuItemAttrGroupVo> groupAttrs;
    //当前商品的秒杀优惠信息
    SeckillInfoVo seckillInfo;
}
