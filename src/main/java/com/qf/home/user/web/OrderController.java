package com.qf.home.user.web;

import com.qf.home.common.vo.R;
import com.qf.home.user.entity.LeaseHouse;
import com.qf.home.user.entity.Order;
import com.qf.home.user.entity.SellHouse;
import com.qf.home.user.entity.User;
import com.qf.home.user.service.LeaseHouseService;
import com.qf.home.user.service.OrderService;
import com.qf.home.user.service.SellHouseService;
import com.qf.home.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/order")
@Api(value = "订单功能", tags = "订单功能")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/selectOrder")
    @ApiOperation(value = "查看订单", notes = "查看订单")
    public R selectOrder(Order order) {
        return orderService.selectMyMessage(order);
    }

    @PostMapping("/insertOrder")
    @ApiOperation(value = "添加订单", notes = "添加订单")
    public R insertOrder(Order order) {
        return orderService.insert(order);
    }

}
