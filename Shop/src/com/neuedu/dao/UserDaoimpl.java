package com.neuedu.dao;

import com.neuedu.dataSource.Druiddata;
import com.neuedu.pojo.User;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.*;

public class UserDaoimpl implements  UserDao{
    private Druiddata druiddata;
    public UserDaoimpl()
    {
        this.druiddata = Druiddata.getDruidata();
    }
    QueryRunner queryRunner = new QueryRunner();

    @Override
    public void register(User user) {
        Connection connection = druiddata.getconnection();
        String sql = "INSERT INTO user values(?,?,?,?)";
        try {
            queryRunner.update(connection,sql,user.getId(),user.getUsername(),user.getPassword(),user.getDate());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User login(User user) {
        Connection getconnection = druiddata.getconnection();
        System.out.println(getconnection);
        String sql = "SELECT username,password from user where username = ? AND password = ?";
        try {
            PreparedStatement preparedStatement = getconnection.prepareStatement(sql);
            preparedStatement.setString(1,user.getUsername());
            preparedStatement.setString(2,user.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(resultSet);
            while ( resultSet.next())
            {
                return user;
            }
            System.out.println(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
