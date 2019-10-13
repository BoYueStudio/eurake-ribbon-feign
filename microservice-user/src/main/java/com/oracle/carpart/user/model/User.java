package com.oracle.carpart.user.model;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/9 20:46
 * @Version: 1.0
 **/
public class User {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }
}
