package com.liu.day01.Thread;

public class SellTicketsSynch implements Runnable{
    //定义一共100张票
    private int tickets = 100;
    //定义一个对象充当同步代码块上的锁
    private Object obj = new Object();
    @Override
    public void run() {
        //模拟循环一直买票
        while (true){
            //为了解决多线程的安全问题，给操作的共享资源代码加同步
            synchronized(obj){
                //判断是否有余票
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
}
