package com.liu.day03.zhujie;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyJunitTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        //1.获取Class
        Class<MyJunitDemo> clz = MyJunitDemo.class;
        //2.获取Class对象中的方法
        Method[] methods = clz.getMethods();
        //3.遍历数组
        for (int i = 0; i < methods.length; i++) {
            //获取每一个Method对象
            Method method1 = methods[i];
            //判断Method对象上，是否存在@MyJunit
            if (method1.isAnnotationPresent(MyJunit.class)){
                method1.invoke(clz.newInstance());
            }
        }

    }
}
