package com.liu.day01.Thread;

//线程执行代码的特点是cpu随机执行代码，执行代码顺序不固定
public class ThreadDemo01 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        mt.setName("mt");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        /*
            0
            1
            2
            3
            4
            mt....0
            mt....1
            mt....2
            mt....3
            mt....4
         */
    }
}
