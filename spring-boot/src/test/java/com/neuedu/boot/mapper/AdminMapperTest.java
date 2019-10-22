package com.neuedu.boot.mapper;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Admin;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AdminMapperTest {
    @Autowired
    private AdminMapper adminMapper;


    @Test
    public void insert() {
        Admin admin = new Admin();
        admin.setUsername("admin");
        admin.setPassword("123");
//        adminMapper.insert(admin);
        log.info(Result.ok(admin).toString());
    }
    @Test
    public  void select(){
        Page<Admin> page = PageHelper.startPage(1,2);
        List<Admin> admins = adminMapper.selectAll();
        log.info(page.getPages()+"页");
        log.info(page.getTotal()+"记录");
        log.info("第"+page.getPageNum()+"页");
    }

}