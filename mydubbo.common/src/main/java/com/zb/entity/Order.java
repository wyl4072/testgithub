package com.zb.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private Integer id;
    private String title;
    private Integer uid;
    private Double price;


    public Order() {
    }

    public Order(Integer id, String title, Integer uid, Double price) {
        this.id = id;
        this.title = title;
        this.uid = uid;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
