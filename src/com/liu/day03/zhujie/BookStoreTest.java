package com.liu.day03.zhujie;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class BookStoreTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //反射：1.class 2.构造器,实例化 3.Method
        Class<BookStore> clz = BookStore.class;
        Constructor<BookStore> con = clz.getConstructor();
        BookStore bookStore = con.newInstance();
        Method method = clz.getMethod("buy");
        //解析注解
        if (method.isAnnotationPresent(Book.class)){
            //获取Method对象上的Book注解
            Book bookAnno = method.getAnnotation(Book.class);
            //获取注解上的数据
            String name = bookAnno.name();
            double price = bookAnno.price();
            String[] authors = bookAnno.authors();

            System.out.println("书名："+name);
            System.out.println("价格："+price);
            System.out.println("作者："+ Arrays.toString(authors));
        }
    }
}
