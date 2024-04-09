package com.liu.day03.ClassLoader;

public class Student {
    private String name;
    private int age;
    private String gender;

    //无参无返回值的方法
    public void study(){
        System.out.println("好好学习，天天向上");
    }
    public void sleep(){
        System.out.println("好好睡觉");
    }
    //有参有返回值的方法
    public String sayHello(String name){
        return "你好"+name;
    }
    //私有方法
    private void eat(String name){
        System.out.println(name+"吃东西");
    }
    //静态方法
    public static void drink(){
        System.out.println("喝牛奶");
    }

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
