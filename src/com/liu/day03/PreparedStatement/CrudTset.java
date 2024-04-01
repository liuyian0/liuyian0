package com.liu.day03.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//使用预编译对象执行删改查
public class CrudTset {
    public static void main(String[] args) throws Exception{
        //1.获取连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testnew","root","1234");
        //2.获取发送sql语句的预编译对象
        //2.1实现删除操作
        PreparedStatement ps1 = connection.prepareStatement("delete from user2 where id = ?");
        //2.2实现修改操作
        //PreparedStatement ps2 = connection.prepareStatement("update user2 set username = ? where id = ?");
        //3.给占位符赋值
        ps1.setInt(1,4);
        //ps2.setString(1,"1203733190");
        //ps2.setInt(2,1);
        //4.执行sql语句
        int i = ps1.executeUpdate();
        System.out.println("i="+i);
        //释放资源
        ps1.close();
        connection.close();
    }
}
