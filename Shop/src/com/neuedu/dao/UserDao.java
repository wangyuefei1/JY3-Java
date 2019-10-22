package com.neuedu.dao;

import com.neuedu.pojo.User;

import java.sql.Date;

public interface UserDao {

    void register (User user);
    User login(User user);
}
