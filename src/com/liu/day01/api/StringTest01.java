package com.liu.day01.api;
import java.util.Scanner;

public class StringTest01 {
public static void main(String[] args) {
  //遍历数组
    Scanner sc = new Scanner(System.in);
    System.out.print("请输入一段字符串：");
    String s = sc.nextLine();
  for (int i = 0; i < s.length(); i++) {
      if (i == s.length()-1) {
      System.out.print(s.charAt(i));
      //charAt(i)返回指定索引处的char值
      } else {
      System.out.print(s.charAt(i)+",");
            }
        }
    }
}
