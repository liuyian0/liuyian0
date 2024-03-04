package com.liu.day01.FunctionalInterface;
/*
    函数式接口 格式：
    修饰符 interface 接口名称{
    public abstract 返回值类型 方法名称（可选参数信息）;
    }

    自定义函数式接口
 */
//@FunctionalInterface该注解用于接口的定义
@FunctionalInterface
public interface MyFunctionalInterface {
    public abstract void myMethod();
    //public abstract可以省略
}
