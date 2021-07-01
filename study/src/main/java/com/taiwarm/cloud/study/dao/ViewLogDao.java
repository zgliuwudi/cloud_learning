package com.taiwarm.cloud.study.dao;

import com.taiwarm.cloud.study.entity.ViewLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习浏览记录表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 10:10:36
 */
@Mapper
public interface ViewLogDao extends BaseMapper<ViewLogEntity> {
	
}
