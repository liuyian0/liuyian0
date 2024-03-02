package com.liu.day01.set;

public class Student {
    private String name;
    private int age;
    private Enum gender;

    //无参构造
    public Student() {
    }

    //有参构造
    public Student(String name, int age, Enum gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //getter Setter
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

    public Enum getGender() {
        return gender;
    }

    public void setGender(Enum gender) {
        this.gender = gender;
    }

    //toString
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
