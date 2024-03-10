package com.liu.day01.Thread;
/*
    实现多线程的方式：
    1.继承Thread
    2.实现Runnable接口
 */
public class MyThread extends Thread {
    public void run() {
        //线程要执行的代码↓
        for (int i = 0; i < 5; i++) {
            //currentThread返回当前正在执行的线程对象的引用
            System.out.println(Thread.currentThread().getName() + "...." + i);
        }
    }
}
