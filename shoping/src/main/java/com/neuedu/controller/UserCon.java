package com.neuedu.controller;


import com.neuedu.common.Const;
import com.neuedu.common.HigherResponse;
import com.neuedu.pojo.User;
import com.neuedu.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/portal/user")
public class UserCon {

    @Autowired
    private Userservice userservice;

    @ResponseBody
    @RequestMapping("/login.do")
    public HigherResponse login(String username, String password, HttpSession session){
        return userservice.login(username,password,session);
    }
    @ResponseBody
    @RequestMapping("/register.do")
    public HigherResponse register(User user){
        return userservice.register(user);
    }
    @ResponseBody
    @RequestMapping("/forget_get_question.do")
    public HigherResponse forgetpsw(String username){
        return userservice.forgetpsw(username);
    }
    @ResponseBody
    @RequestMapping("/forget_check_answer.do")
    public HigherResponse checkAnswer(String username,String question,String answer){
        return userservice.checkAnswer(username,question,answer);
    }

    @ResponseBody
    @RequestMapping("/forget_reset_password.do")
    public HigherResponse resetpsw(String username,String newpsw,String token){
        return userservice.resetPsw(username,newpsw,token);
    }

    @ResponseBody
    @RequestMapping("/login_reset_password.do")
    public HigherResponse login_resetpsw(String password,String newpsw,HttpSession session){
        return userservice.loginResetPsw(password,newpsw,session);
    }

    @ResponseBody
    @RequestMapping("/update_information.do")
    public HigherResponse updateinfo(HttpSession session, User user){
        return userservice.updateInfo(session,user);
    }

    //获取当前用户信息
    @ResponseBody
    @RequestMapping("/get_user_info.do")
    public HigherResponse getinfo(HttpSession session){
        User attribute = (User) session.getAttribute(Const.CURRENTUSER);
        if (null == attribute){
            return  HigherResponse.getResponseFailed("当前无用户登录，无法获取信息");
        }
        return userservice.getUserInfo(session);
    }
}
