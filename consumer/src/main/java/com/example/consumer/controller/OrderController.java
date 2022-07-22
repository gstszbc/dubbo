package com.example.consumer.controller;

import com.example.beaninterface.bean.UserAddress;
import com.example.beaninterface.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author: zhangbicheng
 * Date: 2022/7/22
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/init")
    @ResponseBody
    public List<UserAddress> initOrder(@RequestParam("id") String id) {
        List<UserAddress> list = orderService.getList(id);
        return list;
    }
}
