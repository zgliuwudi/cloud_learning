# 整合全部模块

## 全部模块代码自动生成

- 模块图

  <img src="../images/image-20210704050107765.png" alt="image-20210704050107765" style="zoom:25%;" />

- 数据库图

  <img src="../images/image-20210704050134135.png" alt="image-20210704050134135" style="zoom:25%;" />

- 添加菜单

  <img src="../images/image-20210704050432173.png" alt="image-20210704050432173" style="zoom:50%;" />

## vue

- 新增功能开放

  ![image-20210704075019039](../images/image-20210704075019039.png)

- 拷贝各模块代码、配置请求URL

  ![image-20210704075212523](../images/image-20210704075212523.png)

## gateway

- 解决跨域问题

  ```java
  package com.taiwarm.cloud.gateway.config;
  
  import org.springframework.context.annotation.Bean;
  import org.springframework.context.annotation.Configuration;
  import org.springframework.web.cors.CorsConfiguration;
  import org.springframework.web.cors.reactive.CorsWebFilter;
  import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
  
  @Configuration
  public class MyCorsConfiguration {
      @Bean
      public CorsWebFilter corsWebFilter() {
          UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
  
          CorsConfiguration corsConfiguration = new CorsConfiguration();
  
          // 配置跨域
          corsConfiguration.addAllowedHeader("*"); // 允许所有请求头跨域
          corsConfiguration.addAllowedMethod("*"); // 允许所有请求方法跨域
          corsConfiguration.addAllowedOrigin("*"); // 允许所有请求来源跨域
          corsConfiguration.setAllowCredentials(true); //允许携带cookie跨域，否则跨域请求会丢失cookie信息
  
          source.registerCorsConfiguration("/**", corsConfiguration);
  
          return new CorsWebFilter(source);
      }
  }
  ```

- URL分发

  ```xml
  - id: question
    uri: lb://question
    predicates:
      - Path=/api/question/**
    filters: #过滤器
      - RewritePath=/api/(?<segment>.*),/$\{segment}
  - id: renren-fast
    uri: lb://renren-fast
    predicates:
      - Path=/api/**
    filters: #过滤器
      - RewritePath=/api/(?<segment>.*),/renren-fast/$\{segment}
  ```

## renren-fast

- 注销跨域、加入总pom、加入nacos

![image-20210704075452690](../images/image-20210704075452690.png)