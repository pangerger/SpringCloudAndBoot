package com.pan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * s
 */
@SpringBootApplication
@EnableEurekaClient // eureka 客户端
@EnableFeignClients
public class Provider
{
    public static void main( String[] args )
    {
        SpringApplication.run(Provider.class);
    }
}
