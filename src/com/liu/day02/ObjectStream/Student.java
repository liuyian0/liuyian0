package com.liu.day02.ObjectStream;

import java.io.Serializable;
//为了保证学生对象可以被序列化，让student类来实现Serializable接口
public class Student implements Serializable {
    private String name;
    //transient(瞬态修饰成员),不会被序列化
    private transient int age;

    //有参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter，setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
