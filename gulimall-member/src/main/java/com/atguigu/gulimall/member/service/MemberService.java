package com.atguigu.gulimall.member.service;

import com.atguigu.gulimall.member.exception.PhoneExsitException;
import com.atguigu.gulimall.member.exception.UserNameExistException;
import com.atguigu.gulimall.member.vo.MemberLoginVo;
import com.atguigu.gulimall.member.vo.MemberRegistVo;
import com.atguigu.gulimall.member.vo.SocialUser;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author xialiang
 * @email 1439741774@qq.com
 * @date 2020-09-08 09:54:04
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
    void regist(MemberRegistVo vo);
    
    void checkPhoneUnique(String phone) throws PhoneExsitException;
    
    void checkUserNameUnique(String userName) throws UserNameExistException;
    
    MemberEntity login(MemberLoginVo vo);
    
    MemberEntity login(SocialUser socialUser) throws Exception;
}

