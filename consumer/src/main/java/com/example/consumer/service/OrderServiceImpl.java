package com.example.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.beaninterface.bean.UserAddress;
import com.example.beaninterface.service.OrderService;
import com.example.beaninterface.service.UserService;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Author: zhangbicheng
 * Date: 2022/7/22
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;

    @Override
    public List<UserAddress> getList(String id) {
        List<UserAddress> init = userService.init(id);
        return init;
    }
}
