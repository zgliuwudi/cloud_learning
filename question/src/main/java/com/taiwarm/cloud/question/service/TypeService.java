package com.taiwarm.cloud.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.question.entity.TypeEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 05:06:56
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

