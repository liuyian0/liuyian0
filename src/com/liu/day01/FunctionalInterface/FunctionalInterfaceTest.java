package com.liu.day01.FunctionalInterface;

public class FunctionalInterfaceTest {
    //使用自定义的函数式接口作为方法参数
    public static void doSth(MyFunctionalInterface inter){
        //调用自定义的函数式接口方法
        inter.myMethod();
    }

    public static void main(String[] args) {
        doSth(()-> System.out.println("调用使用函数式接口的方法.."));
    }
}
