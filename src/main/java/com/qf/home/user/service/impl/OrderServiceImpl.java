package com.qf.home.user.service.impl;

import com.qf.home.common.vo.R;
import com.qf.home.user.dao.OrderDao;
import com.qf.home.user.dao.UserDao;
import com.qf.home.user.entity.Order;
import com.qf.home.user.entity.User;
import com.qf.home.user.service.OrderService;
import com.qf.home.user.service.UserService;
import com.qf.home.util.JedisUtil;
import com.qf.home.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public R insert(Order order) {
        orderDao.insert(order);
        return R.Ok();
    }
    @Override
    public R selectMyMessage(Order order) {
        List<Order> select = orderDao.select(order);
        return R.Ok(select);
    }
}
