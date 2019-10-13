package com.oracle.carpart.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/9 19:42
 * @Version: 1.0
 **/
@SpringBootApplication
/**
 * 自动配置该服务为eureka
 */
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class);
    }
}
