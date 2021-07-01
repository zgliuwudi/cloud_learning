package com.taiwarm.cloud.member.feign;

import com.taiwarm.cloud.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: StudyFeignService
 * @program: cloud_learning
 * @Description: TODO
 * @Author: admin
 * @Date: 2021-07-01 11:23
 * @Version: 1.0
 **/
@FeignClient(value = "study")
public interface StudyFeignService {

    @RequestMapping("/study/studytime/member/list/test")
    R memberStudyTimeTest();
}
