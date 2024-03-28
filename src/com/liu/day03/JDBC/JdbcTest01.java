package com.liu.day03.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest01 {
    public static void main(String[] args) throws Exception{
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //连接到MySQL
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testnew","root","1234");
        //连接本地数据库可以简写为"jdbc:mysql:///testnew"
        System.out.println(connection);
        //从连接中拿到一个statement
        Statement statement = connection.createStatement();
        //增
        String create = "insert into user2 values (null,'1203733194','An12303.')";
        //影响的行数
        int i1 = statement.executeUpdate(create);
        System.out.println("影响的行数"+i1);
        //删
        String delete = "delete from user2 where id=4";
        int i2 = statement.executeUpdate(delete);
        System.out.println("影响的行数"+i2);
        //改
        String update = "update user2 set username='1203733190' where id=1";
        int i3 = statement.executeUpdate(update);
        //查
        String retrieve = "select * from user2";
        ResultSet result = statement.executeQuery(retrieve);
        //内部有一个指针，只能取指针指向的那条记录（循环实现遍历）
        while (result.next()){//指针指向有数据才返回true
            int id = result.getInt("id");
            String username = result.getString(2);
            String password = result.getString(3);
            System.out.println(id+":"+username+"-"+password);
        }
        //关闭资源
        result.close();
        statement.close();
        connection.close();
    }
}
