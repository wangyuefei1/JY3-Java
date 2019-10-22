package com.neuedu.apache;

import com.neuedu.entity.Account;
import com.neuedu.utils.ConnectionPool;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ConnectionPool connectionPool = ConnectionPool.getpool();
        Connection connection1 = connectionPool.getConnection();
        try {
           /* Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "123456");*/
            QueryRunner queryRunner = new QueryRunner();
//            String sql = "UPDATE  account set password = ?   where id = ?";
//            int update = queryRunner.update(connection, sql, "123",3);
//            String sql = "INSERT INTO account(username,password) values(?,?)";
//            int update = queryRunner.update(connection, sql, "zxc", "zxc");
//            String sql = "DELETE FROM account where id = ?";
//            int update = queryRunner.update(connection, sql, "6");
//                String sql = "SELECT * FROM account";
//            List<Account> query = queryRunner.query(connection, sql, new BeanListHandler<>(Account.class));
//            String sql = "SELECT * from account WHERE id = ?";
//            Account query = queryRunner.query(connection, sql, new BeanHandler<>(Account.class), "2");
            String sql= "SELECT count(*) from account";
            Object query = queryRunner.query(connection1, sql, new ScalarHandler<>());
            System.out.println(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
