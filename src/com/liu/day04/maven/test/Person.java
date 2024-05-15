package com.liu.day04.maven.test;

public class Person {
    public void speak(){
        //这里this表示子类对象（this谁调用就属于谁）
        System.out.println("this="+this);//this=com.liu.day04.maven.test.Student@4b67cf4d
    }
}
class Student extends Person{

}
