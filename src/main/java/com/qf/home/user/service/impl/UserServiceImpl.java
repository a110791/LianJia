package com.qf.home.user.service.impl;

import com.qf.home.common.vo.R;
import com.qf.home.user.dao.UserDao;
import com.qf.home.user.entity.User;
import com.qf.home.user.service.UserService;
import com.qf.home.util.JedisUtil;
import com.qf.home.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private JedisUtil jedisUtil;

    //判断用户名是否存在
    @Override
    public R select(User user) {
        //判断用户名是否存在
        List<User> select = userDao.select(user);
        if (select == null) {
            return R.Ok();
        }
        return R.fail("用户名已存在");
    }

    //注册
    @Override
    public R insert(User user) {
        if (select(user) != null) {
                userDao.insert(user);
                return R.Ok();
        }
        return R.fail("注册失败");
    }

    //登录验证
    @Override
    public R login(User user) {

        //从数据库查询用户信息是否存在
        List<User> users = userDao.select(user);
        if (user != null) {
            //生成加密令牌
            String jwt = JwtUtil.createJWT(user.getTel());
            System.out.println(jwt);
            //将令牌写入Redis数据库 并设置有效时间
            jedisUtil.addStr(user.getTel(),jwt, 30);

            Map<String, String> qwe = new HashMap<>();

            if (user.getRid()==1) {
                qwe.put("token",jwt);
                qwe.put("rid","1");
                return R.Ok(qwe);
            }else {
                qwe.put("token",jwt);
                qwe.put("rid","2");
                return R.Ok(qwe);
            }
        }
        return R.fail("用户名或密码错误");
    }

    //查看用户个人信息
    @Override
    public R selectMyMessage(User user) {
        List<User> select = userDao.select(user);
        return R.Ok(select);
    }

    //修改个人信息
    @Override
    public R update(User user) {
        userDao.update(user);
        return R.Ok();
    }
}
