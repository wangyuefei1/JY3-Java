package com.neuedu.service;

import com.neuedu.common.HigherResponse;
import com.neuedu.pojo.User;

import javax.servlet.http.HttpSession;

public interface Userservice {

    //根据用户名密码查询用户
    HigherResponse login(String username, String password, HttpSession session);

    //注册
    HigherResponse register(User user);

    //忘记密码
    HigherResponse forgetpsw(String username);

    //提交问题答案
    HigherResponse checkAnswer(String username,String question,String answer);

    //重设密码
    HigherResponse resetPsw(String username,String newpsw,String token);

    //登录重设密码
    HigherResponse loginResetPsw(String password,String newpsw,HttpSession session);

    //修改信息
    HigherResponse updateInfo(HttpSession session,User user);

    //获取信息
    HigherResponse getUserInfo(HttpSession session );
}
