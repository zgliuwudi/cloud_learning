# 整合Gateway

## 创建gateway项目

- 创建

  <img src="../images/image-20210701175707484.png" alt="image-20210701175707484" style="zoom:33%;" />

- 添加依赖

  <img src="../images/image-20210701175732760.png" alt="image-20210701175732760" style="zoom:33%;" />

## application.yml

```yaml
spring:
  application:
    name: gateway
  cloud:
    gateway:
      routes:
        - id: route_qq
          uri: http://www.qq.com
          predicates:
            - Query=url,qq
        - id: member
          uri: lb://member
          predicates:
            - Path=/member/**
    nacos:
      discovery:
        server-addr: 127.0.0.1:8849
      config:
        server-addr: 127.0.0.1:8849
server:
  port: 8888
```

## Application

![image-20210701175945973](../images/image-20210701175945973.png)

## 测试

<img src="../images/image-20210701180035603.png" alt="image-20210701180035603" style="zoom: 50%;" />

