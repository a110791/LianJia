package com.qf.home.user.dao;

import com.qf.home.user.entity.LeaseHouse;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LeaseHouseMapper {
    int insert(LeaseHouse record);
    void delete(int id);
    List<LeaseHouse> select(int userId);
}