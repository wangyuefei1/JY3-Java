package com.neuedu.boot.service;

import com.alibaba.fastjson.JSONObject;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Admin;
import com.neuedu.boot.mapper.AdminMapper;
import com.neuedu.boot.request.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean login(LoginRequest loginRequest) {
        Admin admin = new Admin();
        admin.setUsername(loginRequest.getUsername());
        admin.setPassword(loginRequest.getPassword());
        if ( null !=adminMapper.selectOne(admin)){
            return true;
        }
        return false;
    }

    @Override
    public Result addUser(Admin admin) {
        admin.setCreateTime(LocalDate.now());
        admin.setUpdateTime(LocalDate.now());
        int i = adminMapper.insertSelective(admin);
        if (i>0){
            return  Result.ok("添加成功");
        }
        return Result.fail("添加失败");
    }

    @Override
    public Result resetpsw(Admin admin) {
        admin.setUpdateTime(LocalDate.now());
        Example example = new Example(Admin.class);
        example.and().andEqualTo("username",admin.getUsername());
        int i = adminMapper.updateByExampleSelective(admin, example);
        if (i>0){
            return Result.ok("修改成功");
        }
        return Result.fail("修改失败");
    }

    @Override
    public Result findAll() {
        List<Admin> admins = adminMapper.selectAll();
        if (admins.size()>0){
            return Result.ok(admins);
        }
        return Result.fail("查询失败");
    }

    @Override
    public Result delete(List<Integer> ids) {
        Example example = new Example(Admin.class);
        example.and().andIn("id",ids);
        int i = adminMapper.deleteByExample(example);
        if (i>0){
            return Result.ok("删除成功");
        }
        return Result.fail("删除失败");
    }

    @Override
    public Result deleteByid(Admin admin) {
        int delete = adminMapper.delete(admin);
        if (delete>0){
            return Result.ok("删除成功");
        }
        return Result.fail("删除失败");
    }

    @Override
    public Result update(Admin admin) {
        admin.setUpdateTime(LocalDate.now());
        admin.setPassword(null);
        Example example = new Example(Admin.class);
        example.and().andEqualTo("id",admin.getId());
        if (adminMapper.updateByExampleSelective(admin,example)>0){
            return Result.ok("修改成功");
        }
        return Result.fail("修改失败");
    }


}
