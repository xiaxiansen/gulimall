package com.atguigu.common.to.es;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @program: gulimall -- com.atguigu.common.to.es
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-03 16:55
 */
@Data
public class SkuEsModel {
   private Long skuId;
   private Long spuId;
   private String skuTitle;
   private BigDecimal skuPrice;
   private String skuImg;
   private Long saleCount;
   private Boolean hasStock;
   private Long hasScore;
   private Long brandId;
   private Long catalogId;
   private String brandName;
   private String brandImg;
   private String catalogName;
   private List<Attrs> attrs;
   @Data
   public static class Attrs{
       private Long attrId;
       private String attrName;
       private String attrValue;
   }
}
