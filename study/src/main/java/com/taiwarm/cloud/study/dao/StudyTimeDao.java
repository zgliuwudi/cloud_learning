package com.taiwarm.cloud.study.dao;

import com.taiwarm.cloud.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 10:10:36
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
