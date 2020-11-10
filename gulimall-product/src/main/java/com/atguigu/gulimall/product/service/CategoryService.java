package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.Catelog2Vo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author xialiang
 * @email 1439741774@qq.com
 * @date 2020-09-07 22:08:57
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    List<CategoryEntity> listWithTree();
    
    void removeMenuByIds(List<Long> asList);
    
    Long[] findCatelogPath(Long catelogId);
    
    void updateCascade(CategoryEntity category);
    
    List<CategoryEntity> getLevel1Categorys();
    
    Map<String, List<Catelog2Vo>> getCatalogJson();
    
}

