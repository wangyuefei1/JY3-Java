package com.neuedu.boot.service;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Admin;
import com.neuedu.boot.mapper.AdminMapper;
import com.neuedu.boot.request.LoginRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceTest {
    @Autowired
    private AdminService adminService;

    @Test
    public void login() {
        LoginRequest loginRequest = new LoginRequest();

        loginRequest.setPassword("1234");
        boolean login = adminService.login(loginRequest);
    }

    @Test
    public void addUser() {
        Admin admin = new Admin();
        admin.setUsername("zhangsan");
        admin.setPassword("123");
        adminService.addUser(admin);
    }

    @Test
    public void resetpsw() {
        Admin admin = new Admin();
        admin.setUsername("123");
        admin.setPassword("123456");
        adminService.resetpsw(admin);
    }

    @Test
    public void findAll() {
         adminService.findAll();
    }

    @Test
    public void delete(){
        List<Integer> ids = new ArrayList<>();
        ids.add(23);
        ids.add(24);
        adminService.delete(ids);
    }

    @Test
    public void del(){
        Admin admin = new Admin();
        admin.setId(31);
        adminService.deleteByid(admin);
    }
}