package com.taiwarm.cloud.member.exception;

import com.taiwarm.cloud.exception.BizCodeEnum;
import com.taiwarm.cloud.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ExceptionControllerAdvice
 * @program: cloud_learning
 * @Description: TODO
 * @Author: admin
 * @Date: 2021-07-02 04:26
 * @Version: 1.0
 **/
@Slf4j
@RestControllerAdvice(basePackages = {"com.taiwarm.cloud.member.controller"})
public class ExceptionControllerAdvice {

    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{}，异常类型：{}", e.getMessage(), e.getClass());
        BindingResult bindingResult = e.getBindingResult();
        Map<String, String> errorMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError)->{
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        });

        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(), BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data", errorMap);
    }

    @ExceptionHandler(value=Throwable.class)
    public R handleException(Throwable throwable) {
        throwable.printStackTrace();
        log.error("未知异常{}，异常类型：{}", throwable.getMessage(), throwable.getClass());

        return R.error(BizCodeEnum.UNKNOWN_EXCEPTION.getCode(), BizCodeEnum.UNKNOWN_EXCEPTION.getMsg());
    }
}
