package com.neuedu.boot.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.boot.common.Page;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.User;
import com.neuedu.boot.mapper.UserMapper;
import com.neuedu.boot.request.Pagerequest;
import com.neuedu.boot.vo.GoodsCateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Page<User> getList(Pagerequest pagerequest) {
        PageHelper.startPage(pagerequest.getCurrentPage(),pagerequest.getPageSize());
        List<User> list = userMapper.getList();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        Page<User> objectPage = new Page<>(pageInfo,list);
        return objectPage;
    }

    @Override
    public Result delete(User user) {
        int delete = userMapper.delete(user);
        if (delete>0){
            return Result.ok("删除成功");
        }
        return Result.fail("删除失败");
    }

    @Override
    public Result add(User user) {
        user.setCreateTime(LocalDate.now());
        user.setUpdateTime(LocalDate.now());
        int i = userMapper.insertSelective(user);
        if (i>0){
            return Result.ok("添加成功");
        }
        return Result.fail("添加失败");
    }
}
