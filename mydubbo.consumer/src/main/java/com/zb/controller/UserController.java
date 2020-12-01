package com.zb.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zb.entity.Order;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //徐立---git_test
    @GetMapping("/show")
    @HystrixCommand(fallbackMethod = "fallback_show")
    public List<Order> show() {
        int num = (int) (Math.random() * 10);
        System.out.println(num);
        if (num < 5) {
            throw new RuntimeException("异常了");
        }
        return userService.currentUserorder(1);
    }

    public List<Order> fallback_show() {
        List<Order> list = new ArrayList<Order>();
        list.add(new Order(1, "异常", 1, 0.0));
        return list;
    }
}
