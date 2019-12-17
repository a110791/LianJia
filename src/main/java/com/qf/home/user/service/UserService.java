package com.qf.home.user.service;

import com.qf.home.common.vo.R;
import com.qf.home.user.entity.User;

import java.util.List;

public interface UserService {

    R select (User user);

    R insert (User user);

    R login (User user);

    R selectMyMessage(User user);

    R update(User user);
}
