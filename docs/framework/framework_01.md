# 基础框架搭建

## 人人开源项目下载

- 项目地址：https://gitee.com/renrenio

  ![image-20210630053535385](../images/image-20210630053535385.png)

## 文件拷贝

- 下载的renren-fast解压文件夹拷贝到项目中

- 根目录创建总pom文件

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  	<modelVersion>4.0.0</modelVersion>
  	<groupId>com.taiwarm.cloud</groupId>
  	<artifactId>cloud</artifactId>
  	<version>1.0</version>
  	<packaging>pom</packaging>
  	<description>root pom</description>
  
      <modules>
          <module>renren-fast</module>
      </modules>
  
  </project>
  
  ```

  

- 设置pom、renren-fast为maven项目

  - pom文件鼠标右键设置为maven项目

    <img src="../images/image-20210630062904341.png" alt="image-20210630062904341" style="zoom:50%;" />

- 设置编译环境

  ![image-20210630054617837](../images/image-20210630054617837.png)

  ![image-20210630054706730](../images/image-20210630054706730.png)

  ![image-20210630054835204](../images/image-20210630054835204.png)

- 编译

  <img src="../images/image-20210630055449672.png" alt="image-20210630055449672" style="zoom:50%;" />

## 项目启动

- 拷贝renren-fast下mysql数据库作为初始数据库

- 添加数据库名字

  ```
  DROP DATABASE IF EXISTS `cloud_admin`;
  CREATE DATABASE cloud_admin CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
  USE cloud_admin;
  ```

- 启动后端renren-fast项目

- 启动前端renren-fast-vue项目

  ```
  cnpm install
  npm run dev
  ```

- 登录：admin/admin