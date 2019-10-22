package com.neuedu.utils;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class ConnectionPool {
    private static Properties prop;

    private  static  ConnectionPool connectionpool;
    private  ConnectionPool()
    {

    }

    private static DataSource dataSource;

    static {
        prop = new Properties();
        try {
            prop.load(ConnectionPool.class.getResourceAsStream("/mysql.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(prop);
        } catch (IOException e) {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection()
    {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ConnectionPool getpool()
    {
        if (null == connectionpool)
        {
            connectionpool = new ConnectionPool();
        }
        return connectionpool;
    }

}
