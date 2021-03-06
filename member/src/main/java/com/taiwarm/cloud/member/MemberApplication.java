package com.taiwarm.cloud.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.taiwarm.cloud")
@MapperScan("com.taiwarm.cloud.member.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.taiwarm.cloud.member.feign")
@EnableCaching
public class MemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }

}
