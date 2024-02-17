package com.liu.day01.demo;

public class ToString {
    public static void main(String[] args) {
        //int -> String
        //1.直接加空字符串
        int number = 100;
        String s1 = number + "";
        //2.通过String类静态方法valueOf()
        String s2 = String.valueOf(number);
        //String -> int
        //1.先将字符串数字转换成Integer，再调用valueOf()
        String s = "100";
        int x = Integer.valueOf(s);
        //2.通过Integer静态方法parseInt()进行转换
        int y = Integer.parseInt(s);
    }
}
