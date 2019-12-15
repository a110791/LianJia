package com.qf.home.user.dao;

import com.qf.home.user.entity.User;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserDao {

    int insert (User user);

    List<User> select (User user);

    int update(User user);
}
