package com.oracle.carpart.orders.model;

/**
 * @Description:
 * @Author: boyue
 * @CreateDate: 2019/9/9 21:00
 * @Version: 1.0
 **/
public class Orders {

    private String ordersId;
    private String ordersName;

    public Orders() {
    }

    public String getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(String ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersName() {
        return ordersName;
    }

    public void setOrdersName(String ordersName) {
        this.ordersName = ordersName;
    }
}
