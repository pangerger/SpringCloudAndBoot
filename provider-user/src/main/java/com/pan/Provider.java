package com.pan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 */
@SpringBootApplication
@EnableEurekaClient // eureka 客户端
public class Provider
{
    public static void main( String[] args )
    {
        SpringApplication.run(Provider.class);
    }
}
