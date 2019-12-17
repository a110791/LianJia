package com.qf.home.user.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String tel;
    private Integer wanterHouse;
    private Integer issueHouse;
    private String password;
    private Integer rid;
}
