package com.qf.home.user.service;

import com.qf.home.common.vo.R;
import com.qf.home.user.entity.Order;
import com.qf.home.user.entity.User;

public interface OrderService {

    R insert(Order order);

    R selectMyMessage(Order order);
}
