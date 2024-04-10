package com.liu.day03.zhujie;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义盗版Junit
@Target(ElementType.METHOD)//定义仅用在方法上
@Retention(RetentionPolicy.RUNTIME)//生命周期：运行时
public @interface MyJunit {
    //无属性注解
}
