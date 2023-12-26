package com.liu.day01.Extends;

public class PersonTest {
  public static void main(String[] args) {
    Student s = new Student("张三", 19, "男");
    Teacher t = new Teacher("赵四", 30, "男", 19029);
    System.out.println(s.name);
    System.out.println(t.salary);

  }
}
