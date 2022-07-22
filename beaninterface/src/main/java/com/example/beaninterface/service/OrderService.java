package com.example.beaninterface.service;

import com.example.beaninterface.bean.UserAddress;

import java.util.List;

/**
 * Author: zhangbicheng
 * Date: 2022/7/22
 */
public interface OrderService {
    List<UserAddress> getList(String id);
}
