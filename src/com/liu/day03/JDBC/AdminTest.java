package com.liu.day03.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/*
模拟登录
 */
public class AdminTest {
    public static void main(String[] args) throws Exception{
       //1.创建键盘录入对象
       Scanner sc = new Scanner(System.in);
       //2.提示输入用户名密码
        System.out.print("请输入您的用户名：");
        String usernameIn = sc.nextLine();
        System.out.print("请输入您的密码：");
        String passwordIn = sc.nextLine();
        //*3.注册驱动
        //4.获取和数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testnew","root","1234");
        //5.获取发送sql语句的对象
        Statement statement = connection.createStatement();
        //6.获取查询结果集
        ResultSet resultSet = statement.executeQuery("select * from user2 where username = '" + usernameIn + "' and password = '" + passwordIn + "'");
        //7.处理结果集
        if (resultSet.next()){
            //7.1获取用户名
            String username = resultSet.getString("username");
            //7.2登录成功
            System.out.println("恭喜"+username+"登录成功...");
        }else{
            System.out.println("您输入的用户名或密码错误");
        }
        //8.释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
