package com.qf.home.user.entity;

import lombok.Data;

import java.sql.Date;

@Data
public class Order {
    private int id;
    private int userId;
    private int houseId;
    private Date order;
}
