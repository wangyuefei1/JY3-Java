package com.neuedu.boot.service;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Category;
import com.neuedu.boot.vo.CategoryVO;

import java.util.List;

public interface CategoryService {

    boolean add(Category category);

    Result findAll();

    List<CategoryVO> getList();

    Result deleteByid(Category category);
}
