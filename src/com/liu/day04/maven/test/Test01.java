package com.liu.day04.maven.test;

public class Test01 {
    public static void main(String[] args) {
        //多态，s是子类对象
        Person s = new Student();
        System.out.println("s = " + s);//s = com.liu.day04.maven.test.Student@4b67cf4d+
        //使用子类对象调用父类方法
        s.speak();
    }
}
