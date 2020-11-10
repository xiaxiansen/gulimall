package com.atguigu.gulimall.search.vo;

import lombok.Data;

import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.search.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-08 22:01
 */
/**
*  caatalog3Id=225&keyword=小米&sort=saleCount_asc&hasStock=0/1&brandId=1&brandId=2&attrs=1_其他&attrs=2_5寸:6存
* */
@Data
public class SearchParam {
    /** 页面传递过来的全文匹配关键字  */
    private String keyword;
    /** 三级分类id  */
    private Long catalogId;
    /**
    * sort=saleCount_asc/desc
    * sort=skuPrice_asc/desc
    * sort=hotScore_asc/desc
    * */
    private String sort;
    /*
    *  好多的过滤条件
    *  hasStock(是否有货),skuPrice区间、brandId、catalogId、attr
    *  hasStock=0/1
    *  skuPrice=1_500/_500/500_
    *  brandId=1
    *  attrs=2_5寸:6存
    * */
    /** 是否只显示有货 1 表示有货，0 表示无货，默认为有货*/
    private Integer hasStock = 0;
    /**价格区间查询*/
    private String skuPrice;
    /**按照品牌进行查询，可以多选 */
    private List<Long> brandId;
    /** 按照属性进行筛选 */
    private List<String> attrs;
    /** 页码 */
    private Integer pageNum = 1;
    /** 原生的所有查询条件 */
    private String _queryString;
}
