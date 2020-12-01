package com.zb.service;

import com.zb.entity.Order;

import java.util.List;

public interface RPCOrderService {
    public List<Order> findOrderByUser(Integer uid);
}
