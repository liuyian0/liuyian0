package com.liu.day01.duixiang;

public class AnimalTest {
public static void main(String[] args) {
  //创建对象
  Animal cat = new Animal();
  cat.setName("猫");
  cat.setAge(3);
  System.out.println(cat.getName()+cat.getAge());
}
}
