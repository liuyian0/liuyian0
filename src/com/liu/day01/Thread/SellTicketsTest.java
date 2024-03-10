package com.liu.day01.Thread;

/*
这种写法存在重复票和跳票的情况，反映了多线程的安全问题，通过引入synchronized关键字解决
 */
public class SellTicketsTest {
    public static void main(String[] args) {
        //创建任务类对象
        SellTickets st = new SellTickets();
        //创建线程对象
        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");
        Thread t4 = new Thread(st,"窗口4");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
