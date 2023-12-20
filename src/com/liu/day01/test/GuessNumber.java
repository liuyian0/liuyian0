package com.liu.day01.test;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
public static void main(String[] args) {
  Random r = new Random();
  int num = r.nextInt(100)+1;
  System.out.println(num);
  Scanner s = new Scanner(System.in);
  while (true) {
      System.out.println("请输入一个数字:");
      int guessNum = s.nextInt();
      if (guessNum > num) {
          System.out.println("猜大了");
      }else if (guessNum < num) {
          System.out.println("猜小了");
      }else{
          System.out.println("猜对了");
          break;
      }
  }
}
}
