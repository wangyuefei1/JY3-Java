package com.neuedu.boot.service;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Category;
import com.neuedu.boot.mapper.CategoryMapper;
import com.neuedu.boot.vo.CategoryVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class CategoryServiceimpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public boolean add(Category category) {
        category.setCreateTime(LocalDate.now());
        category.setUpdateTime(LocalDate.now());
        if (categoryMapper.insertSelective(category)>0){
            return true;
        }
        return false;
    }

    @Override
    public Result findAll() {
        List<Category> categories = categoryMapper.selectAll();
        if (categories.size()>0){
            return Result.ok(categories);
        }
        return Result.fail("失败");
    }

    @Override
    public List<CategoryVO> getList() {
        Example example = new Example(Category.class);
        example.and().andEqualTo("parentId",0);
        List<Category> categories = categoryMapper.selectByExample(example);
        List<Category> categoryList = categoryMapper.selectAll();
        List<CategoryVO> categoryVOs = new ArrayList<>();
        for (Category category:categories) {
            CategoryVO categoryVO = new CategoryVO();
            categoryVO.setLabel(category.getName());
            categoryVO.setValue(category.getId().toString());
            categoryVO.setChildren(this.getchildren(category,categoryList));
            categoryVOs.add(categoryVO);
        }
        return categoryVOs;
    }

    @Override
    public Result deleteByid(Category category) {
        Category category1 = new Category();
        category1.setId(category.getId());
        int delete = categoryMapper.delete(category1);
        if (delete>0){
            return  Result.ok("删除成功");
        }
        return Result.fail("删除失败");
    }

    private List<CategoryVO> getchildren(Category category,List<Category> categoryList){
        List<CategoryVO>  categories = new ArrayList<>();
        for (Category category0:categoryList) {
            if (category0.getParentId()==category.getId()){
                CategoryVO categoryVO = new CategoryVO();
                categoryVO.setLabel(category0.getName());
                categoryVO.setValue(category.getId().toString());
                categories.add(categoryVO);
                getchildren(category0,categoryList);
            }
        }
        return  categories;
    }
}
