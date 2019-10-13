package com.oracle.carpart.orders.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

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
/**
 将来如果这个微服务需要调用别的微服务，开启自动搜索功能(eureka查询)
 **/
@EnableDiscoveryClient


@EnableFeignClients(basePackages = {"com.oracle.carpart.orders.webservice"})
public class OrdersApplication {
    public static void main(String[] args) {

        SpringApplication.run(OrdersApplication.class);

    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
