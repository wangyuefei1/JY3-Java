package com.neuedu.service;

import com.neuedu.common.HigherResponse;
import com.neuedu.dao.CategoryMapper;
import com.neuedu.pojo.Category;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Categoryserviceimpl implements Categoryservice {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public HigherResponse getCategory(int id) {
        List<Category> categories = categoryMapper.querySubCategory(id);
        if (null != categories ){
            return HigherResponse.getResponseSuccess(categories,"查询成功");
        }
        return HigherResponse.getResponseFailed("查询失败");
    }

    @Override
    public HigherResponse addCategory(Category category) {
        if (!StringUtils.isNotBlank(category.getName())){
            return HigherResponse.getResponseFailed("类别名不可为空");
        }
        int i = categoryMapper.selectCatename(category.getName());
        if (i>0){
            return HigherResponse.getResponseFailed("类别名已存在");
        }
        category.setStatus(1);
        int i1 = categoryMapper.insertSelective(category);
        if (i1>0){
            return HigherResponse.getResponseSuccess("添加成功");
        }
        return HigherResponse.getResponseFailed("添加失败");
    }


}
