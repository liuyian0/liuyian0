package com.liu.day03.PreparedStatement;

/*
在输入账号时注释密码的输入，从而只输入用户名就完成了账号的登陆(sql注入问题)
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AdminNoPassword {
    public static void main(String[] args) throws Exception{
        //1.创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        //2.输入用户名和密码
        System.out.print("请输入您的用户名：" );
        String usernameIn = sc.nextLine();
        System.out.print("请输入您的密码：");
        String passwordIn = sc.nextLine();
        //3.获取和数据库连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testnew", "root", "1234");
        //4.获取发送sql对象的语句
        Statement statement = connection.createStatement();
        //5.获取查询结果集
        ResultSet resultSet = statement.executeQuery("select * from user2 where username = '" + usernameIn + "' and password = '" + passwordIn + "'");
        //6.处理结果集
        if (resultSet.next()){
            //6.1获取用户名
            String username = resultSet.getString("username");
            System.out.println("恭喜"+username+"登录成功...");
        }else{
            System.out.println("您的用户名或密码输入有误...");
        }
        //释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }
}
