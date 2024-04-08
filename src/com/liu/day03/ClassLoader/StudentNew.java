package com.liu.day03.ClassLoader;

public class StudentNew {
    private String name;
    private StudentNew(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentNew{" +
                "name='" + name + '\'' +
                '}';
    }
}
