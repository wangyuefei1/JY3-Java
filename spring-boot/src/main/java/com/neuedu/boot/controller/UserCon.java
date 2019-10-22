package com.neuedu.boot.controller;

import com.neuedu.boot.common.Page;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.User;
import com.neuedu.boot.request.Pagerequest;
import com.neuedu.boot.service.GoodsService;
import com.neuedu.boot.service.UserService;
import com.neuedu.boot.vo.GoodsCateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserCon {

    @Autowired
    private UserService userService;

    @PostMapping("getList.do")
    public Result getList(@RequestBody Pagerequest pagerequest){

        Page<User> list = userService.getList(pagerequest);
        return Result.ok(list);
    }
    @PostMapping("delete.do")
    public Result delete(@RequestBody User user){
        return userService.delete(user);
    }
    @PostMapping("add.do")
    public Result add(@RequestBody User user){
        return userService.add(user);
    }
}
