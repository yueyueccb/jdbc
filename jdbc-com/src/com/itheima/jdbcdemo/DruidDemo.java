package com.itheima.jdbcdemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {
        Properties prop = new Properties();

        prop.load(new FileInputStream("jdbc-com\\src\\druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        Connection conn = dataSource.getConnection();

        System.out.println(conn);

        System.out.println(System.getProperty("user.dir"));
    }
}
