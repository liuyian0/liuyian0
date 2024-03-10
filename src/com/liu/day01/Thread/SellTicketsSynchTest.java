package com.liu.day01.Thread;

public class SellTicketsSynchTest {
    public static void main(String[] args) {
        //创建任务类对象
        SellTicketsSynch sts = new SellTicketsSynch();
        //创建线程对象
        Thread t1 = new Thread(sts,"售票口1");
        Thread t2 = new Thread(sts,"售票口2");
        Thread t3 = new Thread(sts,"售票口3");
        Thread t4 = new Thread(sts,"售票口4");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
