package com.atguigu.gulimall.product.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.product.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-05 20:44
 */
//二级分类 vo
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catelog2Vo {
    private String catalog1Id; //1级父分类id
    private List<Catelog3Vo> catalog3List; //三级子分类
    private String id;
    private String name;
    //三级分类 vo
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Catelog3Vo{
        private String catalog2Id;  //2级父分类id
        private String id;
        private String name;
    }
}
