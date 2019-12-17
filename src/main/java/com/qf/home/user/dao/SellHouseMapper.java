package com.qf.home.user.dao;

import com.qf.home.user.entity.SellHouse;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SellHouseMapper {
    int insert(SellHouse record);
    void delete(int id);
    List<SellHouse> select(int userId);
}