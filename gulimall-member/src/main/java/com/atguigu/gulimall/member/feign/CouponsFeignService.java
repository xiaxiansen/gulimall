package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: gulimall -- com.atguigu.gulimall.member.feign
 * @description: TODO
 * @author: xia liang
 * @create: 2020-09-08 11:27
 */
@FeignClient("gulimall-coupon")
public interface CouponsFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R membercoupons();
}
