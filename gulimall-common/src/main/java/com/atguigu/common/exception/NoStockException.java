package com.atguigu.common.exception;

/**
 * @program: gulimall -- com.atguigu.gulimall.ware.exception
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-22 17:33
 */
public class NoStockException extends RuntimeException {
    private Long skuId;
    public NoStockException(Long skuId){
        super("商品id:"+skuId+":没有足够的库存了");
    }
    
    public NoStockException(String msg) {
        super(msg);
    }
    
    public Long getSkuId() {
        return skuId;
    }
    
    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
}
