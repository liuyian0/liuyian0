package com.liu.day01.api;
import java.util.Scanner;

public class DengLu {
public static void main(String[] args) {
  String username = "zhangsan";
  String password = "zhaosi666";
  for (int i = 0; i < 3; i++) {
  //键入用户名
  Scanner s = new Scanner(System.in);
  System.out.println("请输入用户名：");
  //键入密码
  String usernameInput = s.nextLine();
  System.out.println("请输入密码：");
  String passwordInput = s.nextLine();
  //用户名，密码一致，则登录成功
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
