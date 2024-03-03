package com.liu.day01.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest2 {
    public static void main(String[] args) {
        /*
        获取异常信息
        Throwable类中定义了一些查看方法
        getMessage（）：获取报错原因，获取异常的描述信息
        toString（）：获取报错的类型和原因
        printStackTrace（）：直接打印报错的类型、原因和位置
         */
        String s = "1997-08-02";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try {
            Date date = sdf.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            //获得报错原因
            System.out.println(e.getMessage());
            //Unparseable date: "1997-08-02"
            //获得报错的类型和原因
            System.out.println(e.toString());
            //java.text.ParseException: Unparseable date: "1997-08-02"
            //直接打印报错的类型、原因和位置
            e.printStackTrace();
            //java.text.ParseException: Unparseable date: "1997-08-02"
            //	at java.text.DateFormat.parse(DateFormat.java:366)
            //	at com.liu.day01.exception.ExceptionTest2.main(ExceptionTest2.java:19)
        }
    }
}
