package com.neuedu.service;

import com.neuedu.common.HigherResponse;
import com.neuedu.pojo.Category;

public interface Categoryservice {

    HigherResponse  getCategory(int id);

    HigherResponse  addCategory(Category category);
}
