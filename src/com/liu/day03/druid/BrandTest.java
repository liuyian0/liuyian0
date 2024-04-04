package com.liu.day03.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.security.PrivateKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.CountDownLatch;

public class BrandTest {
    @Test
    //添加品牌
    public void create() throws Exception{
        //1.加载properties文件的内容到Properties对象中
        Properties p = new Properties();
        p.load(new FileInputStream("src\\druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        //2.获取Connection连接
        Connection connection = ds.getConnection();
        //3.获取PreparedStatement对象
        PreparedStatement ps = connection.prepareStatement("insert into tb_brand values(null,?,?,?,?,?)");
        //4.给占位符赋值
        ps.setString(1,"Apple");
        ps.setString(2,"苹果技术有限公司");
        ps.setInt(3,200);
        ps.setString(4,"Apple666");
        ps.setInt(5,0);
        //执行sql，获取结果
        int i = ps.executeUpdate();
        System.out.println("i="+ i);
        //释放资源
        ps.close();
        connection.close();
    }
    @Test
    //删除品牌
    public void delete() throws Exception{
        //1.加载properties文件的内容到Properties对象中
        Properties p = new Properties();
        p.load(new FileInputStream("src\\druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        //2.获取Connection连接
        Connection connection = ds.getConnection();
        //3.获取发送sql的对象
        PreparedStatement ps = connection.prepareStatement("delete from tb_brand where id = ?");
        //4.给占位符赋值
        ps.setInt(1,4);
        //5.执行sql语句
        int i = ps.executeUpdate();
        System.out.println("i = " + i);
        //6.释放资源
        ps.close();
        connection.close();
    }
    @Test
    //修改品牌
    public void update() throws Exception{
        //1.加载properties文件的内容到Properties对象中
        Properties p = new Properties();
        p.load(new FileInputStream("src\\druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        //2.获取Connection连接
        Connection connection = ds.getConnection();
        //3.获取发送sql的对象
        PreparedStatement ps = connection.prepareStatement("update tb_brand set brand_name = ? where id = ?");
        //4.给占位符赋值
        ps.setString(1,"MI");
        ps.setInt(2,3);
        //5.执行sql语句
        int i = ps.executeUpdate();
        System.out.println("i = " + i);
        //6.释放资源
        ps.close();
        connection.close();
    }
    @Test
    //查询所有品牌
    public void retrieve() throws Exception {
        //1.加载properties文件的内容到Properties对象中
        Properties p = new Properties();
        p.load(new FileInputStream("src\\druid.properties"));
        DataSource ds = DruidDataSourceFactory.createDataSource(p);
        //2.获取Connection连接
        Connection connection = ds.getConnection();
        //3.获取发送sql的对象
        PreparedStatement ps = connection.prepareStatement("select * from tb_brand");
        //4.执行sql
        ResultSet rs = ps.executeQuery();
        //5.处理结果，整理到list集合中
        ArrayList<Brand> list = new ArrayList<>();
        while (rs.next()){
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");

            Brand brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setDescription(description);
            brand.setOrdered(ordered);
            brand.setStatus(status);

            list.add(brand);
        }
        System.out.println("list = " + list);
        //释放资源
        rs.close();
        ps.close();
        connection.close();
    }
}
