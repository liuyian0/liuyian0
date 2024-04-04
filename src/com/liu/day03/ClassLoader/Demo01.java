package com.liu.day03.ClassLoader;

public class Demo01 {
    public static void main(String[] args) {
        //获取自定义的类加载器
        //1.先获取Student对应的Class对象
        Class<Student> cl = Student.class;
        //2.再通过该class对象获取类加载器
        ClassLoader loader = cl.getClassLoader();
        System.out.println("loader = " + loader);

        //获取String类的类加载器
        ClassLoader loader1 = String.class.getClassLoader();
        System.out.println("loader1 = " + loader1);
    }
}

