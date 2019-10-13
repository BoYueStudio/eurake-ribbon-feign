package com.oracle.carpart.user.controller;

import com.oracle.carpart.user.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/9 20:46
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/test")
    public User test(){
        User user=new User();
        user.setPassword("65432");
        user.setUsername("博悦");
        return user;
    }

}
