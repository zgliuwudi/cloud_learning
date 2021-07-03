package com.taiwarm.cloud.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.channel.entity.ChannelEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 * 渠道-渠道表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-03 21:02:04
 */
public interface ChannelService extends IService<ChannelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

