package com.liu.day01.Thread;

public class ControlDemo01 {
    public static void main(String[] args) {
        //创建任务类对象
        ControlTest ct1 = new ControlTest();
        //创建线程对象
        Thread t1 = new Thread(ct1,"sleep");
        //启动线程
        t1.start();
    }
}
