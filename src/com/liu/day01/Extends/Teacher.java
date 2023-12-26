package com.liu.day01.Extends;

public class Teacher extends Person {
    double salary;

    Teacher(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }
}
