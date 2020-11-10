package com.atguigu.gulimall.seckill.service;

import com.atguigu.gulimall.seckill.to.SecKillSkuRedisTo;

import java.util.List;

public interface SeckillService {
    void uploadSeckillSkuLate3Days();
    
    List<SecKillSkuRedisTo> getCurrentSeckillSkus();
    
    SecKillSkuRedisTo getSkuSeckillInfo(Long skuId);
    
    String kill(String killId, String key, String num);
}
