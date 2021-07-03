package com.taiwarm.cloud.content.dao;

import com.taiwarm.cloud.content.entity.BannerEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-横幅广告表
 * 
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-03 21:00:26
 */
@Mapper
public interface BannerDao extends BaseMapper<BannerEntity> {
	
}
