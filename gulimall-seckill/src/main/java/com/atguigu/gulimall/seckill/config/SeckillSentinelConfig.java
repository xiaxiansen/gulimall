package com.atguigu.gulimall.seckill.config;


import com.alibaba.fastjson.JSON;
import com.atguigu.common.exception.BizCodeEnume;
import com.atguigu.common.utils.R;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: gulimall -- com.atguigu.gulimall.seckill.config
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-28 16:21
 */
@Configuration
public class SeckillSentinelConfig {
//    public SeckillSentinelConfig(){
////        WebCallbackManager.setUrlBlockHandler(new UrlBlockHandler() {
////            @Override
////            public void blocked(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws IOException {
////                R error = R.error(BizCodeEnume.TOO_MANY_REQUEST.getCode(), BizCodeEnume.TOO_MANY_REQUEST.getMsg());
////                httpServletResponse.setCharacterEncoding("UTF-8");
////                httpServletResponse.setContentType("application/json");
////                httpServletResponse.getWriter().write(JSON.toJSONString(error));
////            }
////        });
////    }
}
