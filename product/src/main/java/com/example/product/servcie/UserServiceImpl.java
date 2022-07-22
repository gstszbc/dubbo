package com.example.product.servcie;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.beaninterface.bean.UserAddress;
import com.example.beaninterface.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Author: zhangbicheng
 * Date: 2022/7/22
 */
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> init(String id) {
        UserAddress zhangsan = new UserAddress("zhangsan");
        UserAddress wangwu = new UserAddress("wangwu");
        return Arrays.asList(zhangsan, wangwu);
    }
}
