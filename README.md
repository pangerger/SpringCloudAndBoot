# 学习SpringCloud
> 主要是 组件学习 请及时处理具体知识


>SpringCloud 是一系列框架的集合，有许多组件。



## 微服务的服务发现





# 参考

Spring cloud应该怎么入门？
https://www.zhihu.com/question/283286745/answer/763040709

# 有一个要钱的项目
https://how2j.cn/k/trend/trend-2072/2072.html#nowhere


## 视频

基础视频 
http://www.chilangedu.com/sectionq/276151032/11715365992

# 配置

## 密码
>springboot 2.0 以上eureka如何配置密码登录
https://www.jianshu.com/p/36e9b79bf457

# error

## cloud 与 boot 版本不兼容问题

>记录一次springboot结合eureka的坑 "No qualifying bean of type 'javax.servlet.Filter' available"
``` xml

使用 Hoxton.RELEASE 版本可以解决这个问题
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Hoxton.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
    
    
```



