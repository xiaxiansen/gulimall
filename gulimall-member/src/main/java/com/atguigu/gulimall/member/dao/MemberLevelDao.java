package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author xialiang
 * @email 1439741774@qq.com
 * @date 2020-09-08 09:54:04
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
    
    MemberLevelEntity getDefaultLevel();
}
