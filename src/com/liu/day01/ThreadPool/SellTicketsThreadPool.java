package com.liu.day01.ThreadPool;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicketsThreadPool implements Runnable{
    private int tickets = 100;
    //创建锁对象
    private Lock l = new ReentrantLock();
    @Override
    public void run() {
        //模拟买票
        while(true){
            //上锁
            l.lock();
            //有余票
            if (tickets>0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"出票"+tickets);
                tickets--;
            }
            //释放锁
            l.unlock();
        }
    }
}
