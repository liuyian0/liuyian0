package com.liu.day01.Thread;

import java.util.Date;

/*
线程控制：线程休眠
 */
public class ControlTest implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i+new Date());
            //让线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
