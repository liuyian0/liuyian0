package com.liu.day01.api;

public class StringBuilderTest {
public static void main(String[] args) {
      /*StringBuiler创建可变字符串
      append（任意对象）添加操作，并返回对象本身
      reverse（）反转操作
      */
      StringBuilder sb1 = new StringBuilder("hello");
      StringBuilder sb2 = new StringBuilder("world");
      //将sb2拼接到sb1之后，值返回给sb1
      sb1.append(sb2);
      System.out.println(sb1);//helloworld
      System.out.println(sb1.reverse());//dlrowolleh
    }
}
