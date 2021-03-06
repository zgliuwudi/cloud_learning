# 整合链路追踪

## spring cloud 整合sleuth

- common模块配置pom

  ![image-20210702091936569](../images/image-20210702091936569.png)

- member模块配置log日志输出

  <img src="../images/image-20210702092001155.png" alt="image-20210702092001155" style="zoom:50%;" />

- 测试

  <img src="../images/image-20210702092030466.png" alt="image-20210702092030466" style="zoom:33%;" />

![image-20210702092058765](../images/image-20210702092058765.png)

## 整合zipkin

- docker安装

  ```
  docker pull openzipkin/zipkin
  docker run -d --restart always -p 9411:9411 --name zipkin openzipkin/zipkin 
  ```

- common的pom引入

  ```xml
   <!-- 链路追踪组件 Zipkin -->
   <dependency>
   		<groupId>org.springframework.cloud</groupId>
   		<artifactId>spring-cloud-starter-zipkin</artifactId>
   </dependency>
  ```

- 子模块application.yml引入

  ```yaml
  spring:
    zipkin:
      base-url: http://@zipkin.ip@:@zipkin.port@/
      discovery-client-enabled: false
      sender:
        type: web
    sleuth:
      sampler:
        probability: 1
  ```

- 测试效果

  ![image-20210703095353121](../images/image-20210703095353121.png)

