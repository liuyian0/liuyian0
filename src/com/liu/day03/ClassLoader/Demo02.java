package com.liu.day03.ClassLoader;

import org.junit.Test;

public class Demo02 {
    @Test
    public void test01() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //获取Class对象
        Class s = Class.forName("com.liu.day03.ClassLoader.Student");
        //获取类全名
        System.out.println("s.getName() = " + s.getName());
        //获取类名
        System.out.println("s.getSimpleName() = " + s.getSimpleName());
        //创建Class对象关联类的对象
        Student s1 = (Student) s.newInstance();
        s1.study();
    }
    @Test
    public void test02() throws InstantiationException, IllegalAccessException {
        //获取Class对象(对象名.getClass)
        Student student = new Student();
        Class clz = student.getClass();
        //创建Class对象关联类的对象
        Student s1 = (Student) clz.newInstance();
        s1.study();
    }
    @Test
    public void test03() throws InstantiationException, IllegalAccessException {
        //获取Class对象(类型名.class)
        Class clz = Student.class;
        //实例化Student对象
        Object obj = clz.newInstance();
        Student s = (Student) obj;
        s.setName("张三");
        s.setAge(18);
        s.setGender("男");
        System.out.println("s.toString() = " + s.toString());
        s.study();
    }
}
