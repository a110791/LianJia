package com.qf.home.user.dao;

import com.qf.home.user.entity.Order;
import com.qf.home.user.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    int insert(Order order);
    List<Order> select(Order order);
}
