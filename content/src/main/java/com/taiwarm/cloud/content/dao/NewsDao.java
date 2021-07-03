package com.taiwarm.cloud.content.dao;

import com.taiwarm.cloud.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-03 21:00:25
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
