package com.taiwarm.cloud.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.member.entity.GrowthChangeHistoryEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 * 会员-积分值变化历史记录表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 08:02:58
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

