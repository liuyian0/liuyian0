package com.liu.day01.lambda;

public class Person {
    private String name;
    private int age;
    //无参构造
    public Person() {
    }
    //有参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //getter&Setter

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
    //toString

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
