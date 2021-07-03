package com.taiwarm.cloud.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taiwarm.cloud.content.entity.BannerEntity;
import com.taiwarm.cloud.utils.PageUtils;

import java.util.Map;

/**
 * 内容-横幅广告表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-03 21:00:26
 */
public interface BannerService extends IService<BannerEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

