package com.liu.day01.Thread;

import java.awt.*;

/*
解决多线程的安全问题
人为地控制cpu在执行某个线程操作共享数据的时候，不让其他线程进入到操作共享数据的代码中去，称为线程的同步，用到Synchronized关键字
synchronized关键字使用方式：
1.同步代码块
格式：
synchronized(同步锁){
    需要同步操作的代码
}
2.同步方法(被synchronized修饰的方法)
 */
public class Synchronized {
     int tickets = 100;
    //定义一个对象充当同步代码块上的锁
    private Object obj = new Object();

    //非静态同步方法
    public void method(){
        synchronized(obj){
            if (tickets>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"出票"+tickets);
                tickets--;
            }
        }
    }
    //直接将同步加到方法上
    public synchronized void method1(){
        if (tickets>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"出票"+tickets);
            tickets--;
        }
    }
    //静态同步方法
    public synchronized static void method2(){
        int tickets = 100;
        if (tickets>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"出票"+tickets);
            tickets--;
        }
    }
}
