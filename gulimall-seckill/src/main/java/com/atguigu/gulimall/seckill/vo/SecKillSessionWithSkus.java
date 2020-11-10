package com.atguigu.gulimall.seckill.vo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @program: gulimall -- com.atguigu.gulimall.seckill.vo
 * @description: TODO
 * @author: xia liang
 * @create: 2020-10-27 13:05
 */
@Data
public class SecKillSessionWithSkus {
    private Long id;
    private String name;
    private Date startTime;
    private Date endTime;
    private Integer status;
    private Date createTime;
    private List<SeckillSkuVo> relationSkus;
}
