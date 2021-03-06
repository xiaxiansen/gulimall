package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 商品库存
 * 
 * @author xialiang
 * @email 1439741774@qq.com
 * @date 2020-09-08 10:10:33
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
    
    void addStock(@Param("skuId") Long skuId,@Param("wareId") Long wareId, @Param("skuNum") Integer skuNum);
    
    Long getSkuStock(Long skuId);
    
    List<Long> listWareIdHasSkuStock(@Param("skuId") Long skuId);
    
    Long lockSkuStock(@Param("skuId") Long skuId,@Param("wareId") Long wareId,@Param("num") Integer num);
    
    void unlockStock(@Param("skuId") Long skuId,@Param("wareId") Long wareId,@Param("num") Integer num);
}
