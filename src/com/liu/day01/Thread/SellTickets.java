package com.liu.day01.Thread;
/*
多线程安全问题分析（本质原因是cpu在处理多个线程的时候，在操作共享数据的多条代码之间进行切换导致的）
多窗口卖票的案例
 */
public class SellTickets implements Runnable{
    //定义有100张票
    private int tickets = 100;
    @Override
    public void run() {
        //循环模拟一直卖票
        while (true){
            //tickets>0,还有余票
            if (tickets>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //模拟卖出
                System.out.println(Thread.currentThread().getName()+"出票"+tickets);
                tickets--;
            }
        }
    }
}
