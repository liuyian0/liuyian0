package com.liu.day03.ClassLoader;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//需求：把猫的睡觉方法变成狗的吃饭方法
public class AnimalsTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.加载properties文件的内容到Properties对象中
        Properties properties = new Properties();
        //2.用load()方法将文件中的键值对读取到集合中
        properties.load(AnimalsTest.class.getClassLoader().getResourceAsStream("animals.properties"));
        //3.通过键获取值
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        //4.获取字节码对象
        Class clz = Class.forName(className);
        //5.获取空参构造
        Constructor con = clz.getConstructor();
        //6.执行构造方法
        Object o = con.newInstance();
        //7.获取方法
        Method method = clz.getMethod(methodName);
        //8.执行方法
        method.invoke(o);
    }
}
