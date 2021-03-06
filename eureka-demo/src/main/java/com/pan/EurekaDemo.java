package com.pan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * euraka 服务
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDemo
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaDemo.class,args);
    }

    /**
     * Spring Cloud 2.0 以上的security默认启用了csrf检验，要在eureka server端配置security的csrf检验为false。
     */
    @EnableWebSecurity
    class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            super.configure(http);
            http.csrf().disable();
        }
    }
}
