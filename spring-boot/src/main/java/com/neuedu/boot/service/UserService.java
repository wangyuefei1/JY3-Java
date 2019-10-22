package com.neuedu.boot.service;

import com.neuedu.boot.common.Page;
import com.neuedu.boot.common.Result;
import com.neuedu.boot.entity.User;
import com.neuedu.boot.request.Pagerequest;

public interface UserService {
    Page<User> getList(Pagerequest pagerequest);

    Result delete(User user);

    Result add(User user);
}
