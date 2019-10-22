package com.neuedu.boot.service;

import com.alibaba.fastjson.JSONArray;
import com.neuedu.boot.entity.Category;
import com.neuedu.boot.vo.CategoryVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceTest {
    @Autowired
    private CategoryService categoryService;

    @Test
    public void add() {
        Category category = new Category();
        category.setName("数码");
        category.setParentId(0);
        categoryService.add(category);
    }

    @Test
    public void getList() {
        List<CategoryVO> list = categoryService.getList();
        log.info(JSONArray.toJSONString(list));
    }

    @Test
    public void delete (){
        Category category = new Category();
        category.setId(34);
        categoryService.deleteByid(category);
    }
}