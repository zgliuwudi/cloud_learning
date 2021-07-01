package com.taiwarm.cloud.member.dao;

import com.taiwarm.cloud.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 08:02:58
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
