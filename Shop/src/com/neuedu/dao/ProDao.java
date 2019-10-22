package com.neuedu.dao;

import com.neuedu.pojo.Product;

import java.util.List;

public interface ProDao {

    void Addmsg(Product product);
    void Updatemsg(Product product);
    List<Product> Querymsg();
}
