package com.zb.service;

import com.zb.entity.Order;

import java.util.List;

public interface UserService {
    public List<Order> currentUserorder(Integer uid);
}
