package com.taiwarm.cloud.study.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.study.entity.StudyTimeEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 * 学习-用户学习时常表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 10:10:36
 */
public interface StudyTimeService extends IService<StudyTimeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

