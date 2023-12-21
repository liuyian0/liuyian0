package com.liu.day01.api;
import java.util.Scanner;
public class StringTest02 {
public static void main(String[] args) {
    //算出一段字符串中大小写以及数字的个数
  Scanner sc = new Scanner(System.in);
  System.out.println("请输入一串字符串:");
  String line = sc.nextLine();
  int number = 0;
  int big = 0;
  int little = 0;
  for (int i = 0; i < line.length(); i++) {
      /*
      ASCII中
      49-57对应0-9
      65-90对应a-z
      97-122对应A-Z
      */
      if (line.charAt(i)>=49&&line.charAt(i)<=57) {
//或者if(line.charAt(i)>='0'&&line.charAt(i)<='9')
          number++;
      }else if(line.charAt(i)>=65&&line.charAt(i)<=90){
          little++;
      }else if(line.charAt(i)>=97&&line.charAt(i)<=122){
          big++;
      }else{}
  }
  System.out.println("数字有"+number+"个，小写有"+little+"个，大写有"+big+"个");
}
}
