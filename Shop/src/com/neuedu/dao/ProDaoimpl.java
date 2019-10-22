package com.neuedu.dao;

import com.neuedu.dataSource.Druiddata;
import com.neuedu.pojo.Product;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProDaoimpl implements ProDao{
    private Druiddata druiddata;
    public ProDaoimpl()
    {
        this.druiddata = Druiddata.getDruidata();
    }
    QueryRunner queryRunner = new QueryRunner();
    @Override
    public void Addmsg(Product product) {
        Connection connection = druiddata.getconnection();
        String sql = "INSERT INTO product values(?,?,?,?,?,?,?,?,?)";
        try {
            queryRunner.update(connection, sql, product.getPro_id(), product.getPro_name(), product.getPro_price(), product.getPro_image(), product.getPro_des(), product.getPro_stock(), product.getPro_date(), product.getPro_category_id(), product.getPro_factory());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void Updatemsg(Product product) {
        Connection connection = druiddata.getconnection();
        String sql = "UPDATE  set pro_name = ?,pro_price = ?,pro_image = ?,pro_des = ?,pro_stock = ?,pro_date = ?,pro_category_id = ?,pro_factory =? WHERE id = ?";
        try {
            queryRunner.update(connection,sql,product.getPro_name(),product.getPro_price(),product.getPro_image(),product.getPro_des(),product.getPro_stock(),product.getPro_date(),product.getPro_category_id(),product.getPro_factory(),product.getPro_id());

        } catch (SQLException e) {

        }
    }

    @Override
    public List<Product> Querymsg() {
        List<Product> products = null;
        Connection connection = druiddata.getconnection();
        String sql = "SELECT * from product";
        try {
            products = queryRunner.query(connection,sql,new BeanListHandler<>(Product.class));
            } catch (SQLException ex) {
            ex.printStackTrace();
        }
       return products;
    }
}
