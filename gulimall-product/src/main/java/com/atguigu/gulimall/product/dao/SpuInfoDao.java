package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.SpuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息
 * 
 * @author xialiang
 * @email 1439741774@qq.com
 * @date 2020-09-07 22:08:57
 */
@Mapper
public interface SpuInfoDao extends BaseMapper<SpuInfoEntity> {
    
    void updataSpuStatus(@Param("spuId") Long spuId,@Param("code") int code);
}
