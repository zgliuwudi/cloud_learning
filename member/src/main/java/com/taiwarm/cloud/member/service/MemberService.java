package com.taiwarm.cloud.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.member.entity.MemberEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 08:02:58
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

