package com.liu.day03.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//JDBC操作事务实现转账操作
public class ToListTest {
    public static void main(String[] args) throws Exception{
        //初始化值
        Connection connection = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        try {
            //获取数据库连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testnew","root","1234");
            //开启手动控制事务(关闭自动控制事务)
            connection.setAutoCommit(false);
            //获取发送sql语句的预编译对象
            ps1 = connection.prepareStatement("update account set money = money - 100 where name = ?");
            ps2 = connection.prepareStatement("update account set money = money + 100 where name = ?");
            //给占位符赋值
            ps1.setString(1,"a");
            ps2.setString(1,"b");
            //发送sql语句
            ps1.executeUpdate();
            ps2.executeUpdate();
            //提交事务
            connection.commit();
        } catch (Exception throwables) {
            throwables.printStackTrace();
            try {
                //出现异常，回滚事务
                if (connection != null){
                    connection.rollback();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        finally {
         //处理结果
         try {
             //防止空指针异常
             if (ps2 != null){
                 ps2.close();
             }
         }catch (SQLException e){
             e.printStackTrace();
         }
         try {
             if (connection != null){
                 connection.close();
             }
         }catch (SQLException throwables){
             throwables.printStackTrace();
         }
        }
    }
}
