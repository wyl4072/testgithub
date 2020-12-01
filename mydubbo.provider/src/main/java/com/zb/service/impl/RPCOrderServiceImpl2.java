package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Order;
import com.zb.service.RPCOrderService;

import java.util.ArrayList;
import java.util.List;

//@Service(version = "2.0.0")
public class RPCOrderServiceImpl2 implements RPCOrderService {

    private static List<Order> lists = new ArrayList<>();

    static {
        lists.add(new Order(1, "订单1", 1, 20.0));
        lists.add(new Order(2, "订单2", 1, 20.0));
        lists.add(new Order(3, "订单3", 1, 20.0));
        lists.add(new Order(4, "订单4", 1, 20.0));
    }

    @Override
    public List<Order> findOrderByUser(Integer uid) {
        System.out.println("调用服务器端！version=2");
        return lists;
    }
}
