package com.liu.day01.api;
import java.util.Scanner;

public class DengLu {
public static void main(String[] args) {
  String username = "zhangsan";
  String password = "zhaosi666";
  for (int i = 0; i < 3; i++) {
  Scanner s = new Scanner(System.in);
  System.out.println("请输入用户名：");
  String usernameInput = s.next();
  System.out.println("请输入密码：");
  String passwordInput = s.next();
  if (usernameInput.equals(username) && passwordInput.equals(password)) {
    System.out.println("登录成功。。。");
    break;
  } else {
    if (i==2) {
      System.out.println("密码输入错误已达三次，您的账户已锁定");
      break;
    } else {
    System.out.println("登录失败，请重新登录！您还有"+(2-i)+"次机会！");
    }
  }
    }
  }
}
