package com.taiwarm.cloud.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.study.entity.ViewLogEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 * 学习-用户学习浏览记录表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 10:10:36
 */
public interface ViewLogService extends IService<ViewLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

