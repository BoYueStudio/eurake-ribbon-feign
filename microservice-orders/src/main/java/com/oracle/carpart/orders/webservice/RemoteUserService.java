package com.oracle.carpart.orders.webservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient("microservice-user")
public interface RemoteUserService {
    @RequestMapping("/user/test")
    public String findUser();
}
