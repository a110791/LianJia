package com.qf.home.user.web;

import com.qf.home.common.vo.R;

import com.qf.home.user.entity.User;
import com.qf.home.user.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
@Api(value = "用户相关功能", tags = "用户相关功能")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    @ApiOperation(value = "用户注册", notes = "用户注册")
    public R insert (User user) {
        return userService.insert(user);
    }

    @PostMapping("/login")
    @ApiOperation(value = "登录验证", notes = "登录验证")
    public R login (User user) {
        return userService.login(user);
    }

    @GetMapping("/selectMyMessage")
    @ApiOperation(value = "查看用户个人信息", notes = "查看用户个人信息")
    public R selectMyMessage(User user) {
        return userService.selectMyMessage(user);
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改用户个人信息", notes = "修改用户个人信息")
    public R update(User user) {
        return userService.update(user);
    }

    @PostMapping("/bylogin")
    @ApiOperation(value = "退出登录", notes = "退出登录")
    public R bylogin(User user) {
        return null;
    }

}
