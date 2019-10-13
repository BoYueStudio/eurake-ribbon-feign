package com.oracle.carpart.user.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/9 20:41
 * @Version: 1.0
 **/
@SpringBootApplication
/**
 * @Description: 启用eureka 客户端，去注册中心注册微服务
 * @Author:      Administrator
 * @Param:
 * @Return
 **/
@EnableEurekaClient
@ComponentScan("com.oracle")
@EnableDiscoveryClient
public class UserApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserApplication.class);

    }
}
