package com.neuedu.boot.controller;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Admin;
import com.neuedu.boot.request.LoginRequest;
import com.neuedu.boot.service.AdminService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
@CrossOrigin
public class AdminController {
    @Autowired
    private AdminService adminService;
    @RequestMapping("login.do")
    public Result getAdmin(@RequestBody LoginRequest loginRequest){
        if (adminService.login(loginRequest)){
                return Result.ok("登陆成功");
        }
        return Result.fail("登录失败");
    }

    @RequestMapping("addUser.do")
    public  Result adduser(@RequestBody Admin admin){
       return adminService.addUser(admin);
    }

    @PutMapping("resetpsw.do")
    public  Result reset(@RequestBody Admin admin){
        return adminService.resetpsw(admin);
    }

    @RequestMapping("findAll.do")
    public  Result findall(){
        return adminService.findAll();
    }

    @RequestMapping("delete.do")
    public Result delete(@RequestBody List<Integer> ids){
        return adminService.delete(ids);
    }

    @DeleteMapping("deleteByid.do")
    public Result deleteByid(@RequestBody Admin admin){
        return adminService.deleteByid(admin);
    }
    @PostMapping("update.do")
    public  Result update(@RequestBody Admin admin){
        return adminService.update(admin);
    }


}
