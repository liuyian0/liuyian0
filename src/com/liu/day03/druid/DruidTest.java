package com.liu.day03.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.util.JdbcUtils;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DruidTest {
    public static void main(String[] args) throws Exception{
        //1.加载properties文件的内容到Properties对象中
        Properties pro = new Properties();
        //2.加载项目下的属性文件
        //配置文件在根目录下时
        //FileInputStream fis = new FileInputStream("druid.properties");

        //配置文件在src目录下
        InputStream is = DruidTest.class.getClassLoader().getResourceAsStream("druid.properties");
        //3.从输入流中加载属性
        pro.load(is);
        System.out.println(pro);
        //4.创建druid连接池，使用配置文件中的参数
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        //5.初始化值
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            //6.获得连接
            connection = dataSource.getConnection();
            //7.获取发送sql的对象
            preparedStatement = connection.prepareStatement("select * from student where name = ? and gender = ?");
            //8.给占位符赋值
            preparedStatement.setString(1,"赵四");
            preparedStatement.setString(2,"男");
            //9.执行sql，获取结果
            resultSet = preparedStatement.executeQuery();
            //处理结果
            if (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String gender = resultSet.getString("gender");
                System.out.println(id+"---"+name+"---"+gender);
            }else{
                System.out.println("未查询到对应的用户信息");
            }
        }catch (Exception e){

                }
    }
}
