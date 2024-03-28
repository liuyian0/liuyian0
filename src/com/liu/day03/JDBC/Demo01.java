package com.liu.day03.JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo01 {
    public static void main(String[] args) throws Exception {
        //注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        /*
        不过Driver类会主动注册，此时驱动就会被注册两次，可以直接通过Class.forName("com.mysql.jdbc.Driver")来加载驱动(包名.类名)
         */
        Class.forName("com.mysql.jdbc.Driver");
    }
}
