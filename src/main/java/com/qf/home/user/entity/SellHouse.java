package com.qf.home.user.entity;

import lombok.Data;

@Data
public class SellHouse {

    private Integer id;
    private String hendline;
    private String area;
    private String specifiation;
    private Integer districtId;
    private Integer residenceId;
    private String regionName;
    private Double price;
    private Integer userId;
    private Integer agentId;
}