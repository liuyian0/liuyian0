package com.liu.day01.Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
用lock锁实现线程安全的卖票程序
 */
public class SellTickersLock implements Runnable{
    //定义一共有100张票
    private int tickets = 100;
    //定义一把锁
    //由于Lock属于接口，不能创建对象，使用它的子类ReentrantLock来创建对象并使用Lock接口中的函数
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //加锁
            l.lock();
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
