package com.liu.day01.demo;

import sun.java2d.pipe.SpanShapeRenderer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class HowOldAreYou {
    public static void main(String[] args) throws ParseException {
        //键入生日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日，格式为“2000年8月8日");
        String birthday = sc.nextLine();
        //将生日字符串转换成日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthDate = sdf.parse(birthday);
        //获取当前时间
        Date nowDate = new Date();
        //转化为相应的毫秒值
        long birthDateTime = birthDate.getTime();
        long nowDateTime = nowDate.getTime();
        //计算差值转化为天数
        System.out.println("你已经活了"+((nowDateTime-birthDateTime)/1000/60/60/24)+"天了");
    }
}
