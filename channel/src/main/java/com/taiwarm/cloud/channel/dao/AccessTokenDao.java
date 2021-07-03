package com.taiwarm.cloud.channel.dao;

import com.taiwarm.cloud.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-03 21:02:04
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
