# 整合多环境开发

## 父pom

### 开发环境定义

```xml
<profiles>
        <profile>
            <id>dev</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <profiles.active>dev</profiles.active>
                <nacos.ip>192.168.3.40</nacos.ip>
                <nacos.port>8848</nacos.port>
                <zipkin.ip>192.168.3.40</zipkin.ip>
                <zipkin.port>9411</zipkin.port>
            </properties>
        </profile>
        <profile>
            <id>prod</id>
            <properties>
                <profiles.active>prod</profiles.active>
                <nacos.ip>127.0.0.1</nacos.ip>
                <nacos.port>8848</nacos.port>
            </properties>
        </profile>
    </profiles>
```

### 配置文件读取pom数据生效

```xml
<build>
        <resources>
            <resource>
                <directory>src/main/resources</directory>
                <filtering>true</filtering>
                <includes>
                    <include>*.yml</include>
                    <include>**/**.xml</include>
                </includes>
            </resource>
        </resources>
    </build>
```

## 子模块

### 配置文件

```yaml
spring:
  cloud:
    nacos:
      config:
        server-addr: @nacos.ip@:@nacos.port@
```

