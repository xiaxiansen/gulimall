package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.SkuItemVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SkuInfoEntity;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * sku信息
 *
 * @author xialiang
 * @email 1439741774@qq.com
 * @date 2020-09-07 22:08:57
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    void saveSkuInfo(SkuInfoEntity skuInfoEntity);
    
    PageUtils queryPageByCondition(Map<String, Object> params);
    
    List<SkuInfoEntity> getSkusBySpuId(Long spuId);
    
    SkuItemVo item(Long skuId) throws ExecutionException, InterruptedException;
}

