package com.neuedu.service;

import com.neuedu.common.Const;
import com.neuedu.common.GuavaCache;
import com.neuedu.common.HigherResponse;
import com.neuedu.common.StatusUtil;
import com.neuedu.dao.UserMapper;
import com.neuedu.pojo.User;
import com.neuedu.utils.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.UUID;

@Service
public class Userserviceimpl implements  Userservice {
    @Autowired
    private UserMapper userMapper;

    @Override
    public HigherResponse login(String username, String password, HttpSession session) {
        if (username == null || username.length() == 0 ){
            return HigherResponse.getResponseFailed("用户名不能为空");
        }
        if (password == null || password.length() == 0 ){
            return HigherResponse.getResponseFailed("密码不能为空");
        }
        int i = userMapper.selectUserByusername(username);
        if (i==0){
            return HigherResponse.getResponseFailed("用户名不存在");
        }
        User user = userMapper.selectUser(username, password);
        if(user == null ){
            return HigherResponse.getResponseFailed("用户名或密码错误,重新输入");
        }
        session.setAttribute(Const.CURRENTUSER,user);
        return HigherResponse.getResponseSuccess(user,"登陆成功");
    }

    @Override
    public HigherResponse register(User user) {
        if (!StringUtils.isNotBlank(user.getUsername())){
            return  HigherResponse.getResponseFailed("用户名输入错误");
        }
        if (!StringUtils.isNotBlank(user.getPassword())){
            return  HigherResponse.getResponseFailed("密码输入错误");
        }
        if (!StringUtils.isNotBlank(user.getEmail())){
            return  HigherResponse.getResponseFailed("邮箱输入错误");
        }
        if (!StringUtils.isNotBlank(user.getPhone())){
            return  HigherResponse.getResponseFailed("手机号输入错误");
        }
        if (!StringUtils.isNotBlank(user.getAnswer())){
            return  HigherResponse.getResponseFailed("密保答案输入错误");
        }
        if (!StringUtils.isNotBlank(user.getQuestion())){
            return  HigherResponse.getResponseFailed("密保问题输入错误");
        }
        HigherResponse higherResponse = check(user.getUsername(), Const.USERNAME);
        if (higherResponse.getStatus() == StatusUtil.FAILEDSTATUS){
            return HigherResponse.getResponseFailed("用户名已存在");
        }
        HigherResponse higherResponse2 = check(user.getEmail(), Const.EMAIL);
        if (higherResponse2.getStatus() == StatusUtil.FAILEDSTATUS){
            return HigherResponse.getResponseFailed("邮箱已存在");
        }
        //密码加密
        MD5Util.MD5Encode(user.getPassword(),null);
        user.setRole(Const.COMMONUSER);
        int i = userMapper.insert(user);
        if (i == 0){
            return HigherResponse.getResponseFailed("注册失败");
        }
        return HigherResponse.getResponseSuccess("注册成功");
    }

    @Override
    public HigherResponse forgetpsw(String username) {
        if (!StringUtils.isNotBlank(username))
        {
            return HigherResponse.getResponseFailed("输入用户名为空");
        }
        HigherResponse higherResponse = this.check(username, Const.USERNAME);
        if (higherResponse.isResponseSuccess()){
            return HigherResponse.getResponseFailed("没有此用户");
        }
        String s = userMapper.seclectQues(username);
        return HigherResponse.getResponseSuccess(s);
    }

    @Override
    public HigherResponse checkAnswer(String username, String question, String answer) {
        if (!StringUtils.isNotBlank(username))
        {
            return HigherResponse.getResponseFailed("输入用户名为空");
        } if (!StringUtils.isNotBlank(question))
        {
            return HigherResponse.getResponseFailed("输入问题为空");
        } if (!StringUtils.isNotBlank(answer))
        {
            return HigherResponse.getResponseFailed("输入答案为空");
        }
        int i = userMapper.checkAnswer(username, question, answer);
        if (i>0){
            String s = UUID.randomUUID().toString();
            GuavaCache.putcache(Const.TOKENCACHE,s);
            return HigherResponse.getResponseSuccess(s,"验证成功");
        }
        return HigherResponse.getResponseFailed("答案错误。");
    }

    @Override
    public HigherResponse resetPsw(String username, String newpsw, String token) {
        if (!StringUtils.isNotBlank(username))
        {
            return HigherResponse.getResponseFailed("输入用户名为空");
        }if (!StringUtils.isNotBlank(newpsw))
        {
            return HigherResponse.getResponseFailed("输入密码为空");
        }if (!StringUtils.isNotBlank(token))
        {
            return HigherResponse.getResponseFailed("token为空");
        }
        //token是否过期
        String getcache = GuavaCache.Getcache(Const.TOKENCACHE);
        if (StringUtils.isNotBlank(getcache)) {
            if (StringUtils.equals(token,getcache))
            {
                int i = userMapper.resetPsw(username, newpsw);
                if (i>0)
                {
                    return HigherResponse.getResponseSuccess("修改成功");
                }
            }
        }
        return HigherResponse.getResponseFailed("修改失败 ");
    }

    @Override
    public HigherResponse loginResetPsw(String password, String newpsw,HttpSession session) {
        User  attribute = (User) session.getAttribute(Const.CURRENTUSER);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请先登录");
        }
        if (!StringUtils.isNotBlank(password))
        {
            return HigherResponse.getResponseFailed("输入旧密码为空");
        }if (!StringUtils.isNotBlank(newpsw))
        {
            return HigherResponse.getResponseFailed("输入新密码为空");
        }
        if (StringUtils.equals(password,newpsw)){
            return HigherResponse.getResponseFailed("新密码不能与旧密码相同");
        }
        if (!StringUtils.equals(password, attribute.getPassword())){
            return HigherResponse.getResponseFailed("旧密码错误");
        }
        int i = userMapper.resetPsw(attribute.getUsername(), newpsw);
        if (i>0)
        {
            attribute.setPassword(newpsw);
            session.setAttribute(Const.CURRENTUSER,attribute);
            return HigherResponse.getResponseFailed("修改成功");
        }
        return HigherResponse.getResponseFailed("修改失败");
    }

    @Override
    public HigherResponse updateInfo(HttpSession session, User user) {
        User attribute = (User)session.getAttribute(Const.CURRENTUSER);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请先登录");
        }
        int i = userMapper.updateByPrimaryKeySelective(user);
        if (i>0){
            return HigherResponse.getResponseSuccess("修改成功");
        }
        return HigherResponse.getResponseFailed("修改失败");
    }

    @Override
    public HigherResponse getUserInfo(HttpSession session) {
        User attribute = (User) session.getAttribute(Const.CURRENTUSER);
        if (null == attribute){
            return HigherResponse.getResponseFailed("无用户");
        }if (null != attribute){
            User user = userMapper.queryUserInfo(attribute.getUsername());
            return HigherResponse.getResponseSuccess(user,"查询成功");
        }
        return HigherResponse.getResponseSuccess("查询失败");
    }

    //检查用户名和邮箱是否有效
    public HigherResponse check(String val,String type){
        if (!StringUtils.isNotBlank(val)){
            return HigherResponse.getResponseFailed("请输入。。。");
        }
        if (StringUtils.isNotBlank(type)){
            if (Const.USERNAME.equals(type))
            {
                int i = userMapper.selectUserByusername(val);
                if (i>0) {
                    return HigherResponse.getResponseFailed("asd用户名已存在");
                }
            }
            if (Const.EMAIL.equals(type))
            {
                int i = userMapper.selectEmail(val);
                if (i > 0) {
                    return HigherResponse.getResponseFailed("邮箱已存在");
                }
            }
        }else {
            return HigherResponse.getResponseFailed("验证失败");

        }
        return HigherResponse.getResponseSuccess("验证通过");
    }
}
