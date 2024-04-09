package com.liu.day03.zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})//使用范围：方法，类
@Retention(RetentionPolicy.RUNTIME)//保证注解在程序执行时有效
public @interface Book {
    String name();
    double price() default 10.0;
    String[] authors();
}
