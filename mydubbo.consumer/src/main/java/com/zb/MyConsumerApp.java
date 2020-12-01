package com.zb;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableDubbo
@EnableHystrix
public class MyConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(MyConsumerApp.class, args);
    }
}
