package com.taiwarm.cloud.member.dao;

import com.taiwarm.cloud.member.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-积分值变化历史记录表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 08:02:58
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
