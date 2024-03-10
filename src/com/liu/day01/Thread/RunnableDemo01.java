package com.liu.day01.Thread;

public class RunnableDemo01 {
    public static void main(String[] args) {
        //创建任务类对象
        MyRunnable mr = new MyRunnable();
        //public Thread(Runnable target,String name):分配一个带有制定目标新的线程对象并指定名字
        Thread t1 = new Thread(mr,"name1");
        Thread t2 = new Thread(mr,"name2");
        //启动线程
        t1.start();
        t2.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        /*
        0
        1
        2
        3
        4
        name1...0
        name2...0
        name2...1
        name2...2
        name2...3
        name2...4
        name1...1
        name1...2
        name1...3
        name1...4
         */
    }
}
