package com.taiwarm.cloud.question.dao;

import com.taiwarm.cloud.question.entity.TypeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 题目-题目类型表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 05:06:56
 */
@Mapper
public interface TypeDao extends BaseMapper<TypeEntity> {
	
}
