package com.taiwarm.cloud.study.controller;

import java.util.Arrays;
import java.util.Map;

import com.taiwarm.cloud.utils.PageUtils;
import com.taiwarm.cloud.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taiwarm.cloud.study.entity.StudyTimeEntity;
import com.taiwarm.cloud.study.service.StudyTimeService;



/**
 * 学习-用户学习时常表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 10:10:36
 */
@RestController
@RequestMapping("study/studytime")
public class StudyTimeController {
    @Autowired
    private StudyTimeService studyTimeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = studyTimeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		StudyTimeEntity studyTime = studyTimeService.getById(id);

        return R.ok().put("studyTime", studyTime);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody StudyTimeEntity studyTime){
		studyTimeService.save(studyTime);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody StudyTimeEntity studyTime){
		studyTimeService.updateById(studyTime);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		studyTimeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

    @RequestMapping("/member/list/test")
    public R memberStudyTimeTest() {
        StudyTimeEntity studyTimeEntity = new StudyTimeEntity();
        studyTimeEntity.setTotalTime(100); // 学习时长：100分钟
        studyTimeEntity.setQuesType(1L); // 题目类型：1 （javaBasic）

        return R.ok().put("studyTime", Arrays.asList(studyTimeEntity));
    }

}
