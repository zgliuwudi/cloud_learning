package com.taiwarm.cloud.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.content.entity.NewsEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-03 21:00:25
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

