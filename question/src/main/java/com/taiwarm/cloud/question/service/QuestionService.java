package com.taiwarm.cloud.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.question.entity.QuestionEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 *
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 05:06:56
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

