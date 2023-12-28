package com.liu.day01.StaticTest;

public class PersonTest {
    public static void main(String[] args) {
      /*
      静态函数，也称类函数
      被static修饰的函数，不需要对象调用，可以直接类名.函数名方式直接调用。
      public static void sleep(){
        System.out.println("睡觉");
      }
      */
      Person.sleep();  //null睡觉
      Person p = new Person("张三", 18); 
      p.speak();  
      /*
      张三睡觉
      张三18说话
      */
    }
}
