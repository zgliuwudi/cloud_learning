package com.taiwarm.cloud.question.controller;

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

import com.taiwarm.cloud.question.entity.TypeEntity;
import com.taiwarm.cloud.question.service.TypeService;




/**
 * 题目-题目类型表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 05:06:56
 */
@RestController
@RequestMapping("question/type")
public class TypeController {
    @Autowired
    private TypeService typeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = typeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		TypeEntity type = typeService.getById(id);

        return R.ok().put("type", type);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TypeEntity type){
		typeService.save(type);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TypeEntity type){
		typeService.updateById(type);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		typeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
