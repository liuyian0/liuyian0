package com.liu.day01.api;

public class StringBuilderToString {
public static void main(String[] args) {
  StringBuilder s1 = new StringBuilder("Hello");
  //toString()实现StringBuilder到String的转化
  String s2 = s1.toString();
  //通过构造方法实现String到StringBuilder的转化
  StringBuilder s3 = new StringBuilder(s2);
    System.out.println(s1.getClass());//class java.lang.StringBuilder
    System.out.println(s2.getClass());//class java.lang.String
    System.out.println(s3.getClass());//class java.lang.StringBuilder
}
}
