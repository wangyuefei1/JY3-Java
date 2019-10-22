package com.neuedu.controller;

import com.neuedu.common.Const;
import com.neuedu.common.HigherResponse;
import com.neuedu.pojo.Category;
import com.neuedu.pojo.User;
import com.neuedu.service.Categoryservice;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/manage/category")
public class CateCon {

    @Autowired
    private Categoryservice categoryservice;

    @RequestMapping("/get_category.do")
    public HigherResponse get_category(HttpSession session, @RequestParam(defaultValue = "0")Integer id) {
        User attribute = (User)session.getAttribute(Const.CURRENTADMIN);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请登录");
        }
        if (attribute.getRole().intValue() == Const.COMMONUSER){
            return HigherResponse.getResponseFailed("没有此权限");
        }
        HigherResponse category = categoryservice.getCategory(id);
        return category;
    }

    @RequestMapping("/add_category.do")
    public HigherResponse add_category(HttpSession session, @RequestParam(defaultValue  = "0")Integer parentid,String catename) {
        User attribute = (User)session.getAttribute(Const.CURRENTADMIN);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请登录");
        }
        if (attribute.getRole().intValue() == Const.COMMONUSER){
            return HigherResponse.getResponseFailed("没有此权限");
        }
        Category category = new Category();
        category.setName(catename);
        category.setParentId(parentid);
        HigherResponse higherResponse = categoryservice.addCategory(category);
        return higherResponse;
    }


}
