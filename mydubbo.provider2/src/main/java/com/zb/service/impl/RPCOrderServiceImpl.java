package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Order;
import com.zb.service.RPCOrderService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Service(version = "1.0.0",weight = 100)
public class RPCOrderServiceImpl implements RPCOrderService {

    private static List<Order> lists = new ArrayList<>();

    static {
        lists.add(new Order(1, "订单1", 1, 20.0));
        lists.add(new Order(2, "订单2", 1, 20.0));
        lists.add(new Order(3, "订单3", 1, 20.0));
        lists.add(new Order(4, "订单4", 1, 20.0));
    }

    @Override
    public List<Order> findOrderByUser(Integer uid) {
        System.out.println("provider2--->调用服务器端！version=1");
        return lists;
    }
}
