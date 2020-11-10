package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.AttrGroupRelationVo;
import com.atguigu.gulimall.product.vo.AttrRespVo;
import com.atguigu.gulimall.product.vo.AttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品属性
 *
 * @author xialiang
 * @email 1439741774@qq.com
 * @date 2020-09-07 22:08:57
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    void saveAttr(AttrVo attr);
    
    PageUtils queryBaseAttrPage(Map<String, Object> params, Long catelogId, String type);
    
    AttrRespVo getAttrInfo(Long attrId);
    
    void updateAtrr(AttrVo attr);
    
    List<AttrEntity> getRelationAttr(Long attrgroupId);
    
    void deleteRelation(AttrGroupRelationVo[] vos);
    
    PageUtils getNoRelationAttr(Map<String, Object> params, Long attrgroupId);
    
    List<Long> selectSearchAttrs(List<Long> attrIds);
}

