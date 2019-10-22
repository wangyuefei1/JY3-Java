package com.neuedu.dao;

import com.neuedu.entity.Account;

import java.util.ArrayList;
import java.util.List;

public interface userdao {

    void register(String user,String psw);
    Account login(Account account);
    void Updatepsw(Account account,String newpsw);
    List<Account> Query();
}