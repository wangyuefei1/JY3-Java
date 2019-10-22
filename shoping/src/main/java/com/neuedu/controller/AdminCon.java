package com.neuedu.controller;

import com.neuedu.common.Const;
import com.neuedu.common.HigherResponse;
import com.neuedu.pojo.Product;
import com.neuedu.pojo.User;
import com.neuedu.service.Adminservice;
import com.neuedu.vo.ProAndDeVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/manage/user")
public class AdminCon {
    @Autowired
    private Adminservice adminservice;

    @RequestMapping("/login.do")
    public HigherResponse admin_login(HttpSession session,String username, String password){
        return  adminservice.login(username, password, session);
    }

    //查询用户
    @RequestMapping("/userList.do")
    public HigherResponse queryUser(HttpSession session){
        User attribute = (User) session.getAttribute(Const.CURRENTADMIN);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请登录");
        }

        return adminservice.queryUser();
    }

    //添加商品
    @RequestMapping("/saveOrUpdate.do")
    public HigherResponse saveOrUpdate(HttpSession session, Product product){
        User attribute = (User) session.getAttribute(Const.CURRENTADMIN);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请登录");
        }
        if (!StringUtils.isNotBlank(product.getName())){
            return HigherResponse.getResponseFailed("您没有输入信息");
        }
        return adminservice.addOrUpdatePro(product);
    }

    //产品上下架
    @RequestMapping("set_sale_status.do")
    public  HigherResponse setSaleStatus(HttpSession session ,Integer id,Integer status){
        User attribute = (User) session.getAttribute(Const.CURRENTADMIN);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请登录");
        }
        return  adminservice.setSaleStatus(id,status);
    }

    //查看商品详情
    @RequestMapping("/detail.do")
    public  HigherResponse<ProAndDeVO>  detail(HttpSession session,Integer id){
        User attribute = (User) session.getAttribute(Const.CURRENTADMIN);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请登录");
        }
        return adminservice.detailDO(id);
    }

    //分页查询
    @RequestMapping("/list.do")
    public HigherResponse getlist(HttpSession session, @RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "2") Integer pageSize){
        User attribute = (User) session.getAttribute(Const.CURRENTADMIN);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请登录");
        }
        return adminservice.listDO(pageNum, pageSize);
    }

    //搜索商品
    @RequestMapping("/search.do")
    public HigherResponse searchPro(HttpSession session,String  name,@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "2") Integer pageSize){
        User attribute = (User) session.getAttribute(Const.CURRENTADMIN);
        if (null == attribute){
            return HigherResponse.getResponseFailed("请登录");
        }
        return adminservice.selectProByName(name, pageNum, pageSize);
    }
}
