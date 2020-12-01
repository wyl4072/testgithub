package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.entity.Order;
import com.zb.service.RPCOrderService;
import com.zb.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Reference(version = "1.0.0" ,loadbalance = "roundrobin")//(timeout = 10000)//(check = false)
    private RPCOrderService rpcOrderService;

    @Override
    public List<Order> currentUserorder(Integer uid) {
        return rpcOrderService.findOrderByUser(uid);
    }
}
