package com.liu.day03.ClassLoader;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo03 {
    @Test
    //使用有无构造器创建对象
    public void getConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.先获取Class对象
        Class clz = Student.class;
        //2.使用Class对象中的方法，获取Constructor对象
        Constructor con = clz.getConstructor();
        System.out.println("con = " + con);
        //3.使用Constructor对象，实例化类
        Student student = (Student) con.newInstance();
        student.setName("张三");
        System.out.println(student.getName());
    }
    @Test
    //使用有参构造器创建对象
    public void test01() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取Class对象
        Class clz = Student.class;
        //2.使用Class对象获取带有参数的构造器（参数用来设置构造方法中参数的类型）
        Constructor con = clz.getConstructor(String.class,int.class,String.class);
        //3.实例化有参构造方法
        Student student = (Student) con.newInstance("张三",18,"男");
        System.out.println(student.toString());
    }
    @Test
    //使用私有构造器创建对象
    public void test02() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取Class对象
        Class clz = StudentNew.class;
        //private Student(String name)
        //2获取私有构造器对象
        Constructor con = clz.getDeclaredConstructor(String.class);
        //当需要对私有成员操作时，需要先取消JVM对访问权限的检查操作
        con.setAccessible(true);//暴力破解（取消权限检查）当次取消
        //3.使用私有构造器，实例化Student对象
        StudentNew student = (StudentNew) con.newInstance("张三");
        System.out.println(student.toString());
    }
}

