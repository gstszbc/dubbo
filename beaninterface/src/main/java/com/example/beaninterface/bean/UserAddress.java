package com.example.beaninterface.bean;

/**
 * Author: zhangbicheng
 * Date: 2022/7/22
 */
public class UserAddress {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAddress(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "name='" + name + '\'' +
                '}';
    }
}
