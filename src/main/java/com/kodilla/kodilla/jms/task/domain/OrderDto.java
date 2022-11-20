package com.kodilla.kodilla.jms.task.domain;

import java.io.Serializable;

public class OrderDto implements Serializable {

    private int orderNumber;
    private String orderName;
    private String orderCustomer;
    private String orderContent;

    public OrderDto() {
    }

    public OrderDto(int orderNumber, String orderName, String orderCustomer, String orderContent) {
        this.orderNumber = orderNumber;
        this.orderName = orderName;
        this.orderCustomer = orderCustomer;
        this.orderContent = orderContent;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public String getOrderCustomer() {
        return orderCustomer;
    }

    public String getOrderContent() {
        return orderContent;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderNumber=" + orderNumber +
                ", orderName='" + orderName + '\'' +
                ", orderCustomer='" + orderCustomer + '\'' +
                ", orderContent='" + orderContent + '\'' +
                '}';
    }
}
