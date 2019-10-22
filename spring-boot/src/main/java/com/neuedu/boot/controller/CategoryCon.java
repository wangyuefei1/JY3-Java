package com.neuedu.boot.controller;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Category;
import com.neuedu.boot.service.CategoryService;
import com.neuedu.boot.vo.CategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoryCon {
    @Autowired
    private CategoryService categoryService;
    @PostMapping("add.do")
    public Result add(@RequestBody Category category){
        if (categoryService.add(category)){
            return Result.ok("添加成功");
        }
        return Result.fail("添加失败");
    }
    @GetMapping("getList.do")
    public Result getlist( ){
        List<CategoryVO> list = categoryService.getList();
        if (list.size()>0){
            System.out.println(list);
            return Result.ok(list);
        }
        return Result.fail("失败");
    }

    @PostMapping("findAll.do")
    public Result findAll(){
        System.out.println(categoryService.findAll());
        return categoryService.findAll();
    }

    @PostMapping("delete.do")
    public Result delete(@RequestBody Category category ){
        return categoryService.deleteByid(category);
    }
}
