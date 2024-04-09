package com.liu.day03.ClassLoader;

import org.junit.Test;

import java.lang.reflect.Method;

/*
获取method对象的步骤：
1.获取Class对象
2.使用Class对象，获取Method方法
3.使用Method对象，执行方法
 */

public class MethodDemo01 {
    @Test
    public void methodTest01() throws ClassNotFoundException {
        //1.获取Class对象
        Class clz = Class.forName("com.liu.day03.ClassLoader.Student");
        //2.使用Class对象，获取Method对象
        //Method[] getMethods()获取当前类和其父类中的所有public成员方法对象，返回数组
        Method[] methods = clz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
    @Test
    public void methodTest02() {
        //1.获取Class对象
        Class clz = Student.class;
        //2.使用Class对象，获取Method对象
        //Method[] getDeclaredMethods()获取当前类中所有方法对象，返回数组
        Method[] methods1 = clz.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method);
        }
    }
}
