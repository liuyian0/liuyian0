package com.liu.day03.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//PreparedStatement解决sql注入问题
public class PreparedStatementTest {
    public static void main(String[] args) throws Exception{
        //1.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //2.提示输入用户名及密码
        System.out.print("请输入您的用户名：");
        String usernameIn = sc.nextLine();
        System.out.print("请输入您的密码：");
        String passwordIn = sc.nextLine();
        //3.获取和数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testnew", "root", "1234");
        //4.使用Connection接口对象调用方法，获取PreparedStatement预编译接口
        PreparedStatement ps = connection.prepareStatement("select * from user2 where username = ? and password = ?");
        //5.使用预编译接口PreparedStatement的对象调用PreparedStatement接口中的方法给sql语句中的占位符赋值
        /*
        第一个参数表示sql语句中的第几个占位符
        第二个参数表示给该占位符赋的实际值
         */
        ps.setString(1,usernameIn);
        ps.setString(2,passwordIn);
        //6.使用预编译接口PreparedStatement对象调用PreparedStatement接口中的方法执行sql语句
        ResultSet resultSet = ps.executeQuery();
        //7.处理结果集
        if (resultSet.next()){
            String username = resultSet.getString("username");
            System.out.println("恭喜"+username+"登录成功...");
        }else {
            System.out.println("您输入的用户名或密码有误...");
        }
        //释放资源
        resultSet.close();
        ps.close();
        connection.close();
    }
}
