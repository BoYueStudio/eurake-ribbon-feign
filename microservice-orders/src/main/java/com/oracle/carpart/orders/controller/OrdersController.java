package com.oracle.carpart.orders.controller;

import com.oracle.carpart.orders.model.Orders;
import com.oracle.carpart.orders.webservice.RemoteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/9 20:46
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired(required = false)
    private RemoteUserService remoteUserService;

    @RequestMapping("/test")
    public String test(){
        Orders orders=new Orders();
        orders.setOrdersId("65432");
        orders.setOrdersName("博悦orders");


        //方式一 通过restTemplate调用注册中心服务里的userService
        //通过ribbon的resttemplate去调用远程的微服务了（先去eureka查询
        // microservice-user对应的机器列表，ribbon通过轮询的机制来实现负载均衡
        // ）
//        String value=restTemplate.getForEntity("http://microservice-user/user/test", String.class).getBody();


        //方式二 配置remoteUserService

        String value=remoteUserService.findUser();
        return orders.toString()+value+"4";
    }

}
