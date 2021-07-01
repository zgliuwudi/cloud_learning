package com.taiwarm.cloud.study.service.impl;

import com.taiwarm.cloud.utils.PageUtils;
import com.taiwarm.cloud.utils.Query;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.taiwarm.cloud.study.dao.StudyTimeDao;
import com.taiwarm.cloud.study.entity.StudyTimeEntity;
import com.taiwarm.cloud.study.service.StudyTimeService;


@Service("studyTimeService")
public class StudyTimeServiceImpl extends ServiceImpl<StudyTimeDao, StudyTimeEntity> implements StudyTimeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<StudyTimeEntity> page = this.page(
                new Query<StudyTimeEntity>().getPage(params),
                new QueryWrapper<StudyTimeEntity>()
        );

        return new PageUtils(page);
    }

}
