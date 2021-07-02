package com.taiwarm.cloud.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.taiwarm.cloud.member.feign.StudyFeignService;
import com.taiwarm.cloud.utils.PageUtils;
import com.taiwarm.cloud.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taiwarm.cloud.member.entity.MemberEntity;
import com.taiwarm.cloud.member.service.MemberService;

import javax.validation.Valid;


/**
 * 会员-会员表
 *
 * @author wudi
 * @email wudi@taiwarm.com
 * @date 2021-07-01 08:02:58
 */
@RestController
@RequestMapping("member/member")
@RefreshScope
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    private StudyFeignService studyFeignService;

    @Value("${nick.name}")
    private String nickName;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

    @RequestMapping("/feigntest")
    public R feignTest(){
        R r = studyFeignService.memberStudyTimeTest();
        return r;
    }

    @RequestMapping("/nacos/config/test")
    public String NacosConfigTest(){
        return "nick name="+nickName;
    }

    @RequestMapping("/exception/test")
    public R exceptionTest(@Valid @RequestBody MemberEntity memberEntity){
        System.out.println(memberEntity);
        return R.ok();
    }

}
