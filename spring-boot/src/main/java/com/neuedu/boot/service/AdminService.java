package com.neuedu.boot.service;

import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.Admin;
import com.neuedu.boot.request.LoginRequest;

import java.util.List;

public interface AdminService {

    boolean login(LoginRequest loginRequest);

    Result addUser(Admin admin);

    Result resetpsw(Admin admin);

    Result findAll();

    Result delete(List<Integer> ids);

    Result deleteByid(Admin admin);

    Result update(Admin admin);
}
