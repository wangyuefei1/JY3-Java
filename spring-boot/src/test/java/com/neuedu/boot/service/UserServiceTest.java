package com.neuedu.boot.service;

import com.alibaba.fastjson.JSONArray;
import com.neuedu.boot.common.Page;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.User;
import com.neuedu.boot.request.Pagerequest;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.Table;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void getList() {
        Pagerequest pagerequest = new Pagerequest();
        pagerequest.setCurrentPage(1);
        pagerequest.setPageSize(2);
        Page<User> list = userService.getList(pagerequest);
        log.info(JSONArray.toJSONString(list));
    }
    @Test
    public void add(){
        User user = new User();
        user.setUsername("lisi");
        user.setRealname("li");
        user.setPhone("123321");
        user.setStatus(1);
        userService.add(user);
    }
}