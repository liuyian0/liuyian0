package com.liu.day03.JDBC;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        //Class.forName("com.mysql.jdbc.Driver")来加载驱动(调用包名.类名的静态代码块)，而加载驱动时会调用Driver中的静态代码块，其静态代码块中注册了一次驱动
        Class.forName("com.liu.day03.JDBC.Test");
    }
}
