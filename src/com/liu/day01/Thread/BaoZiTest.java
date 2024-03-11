package com.liu.day01.Thread;

public class BaoZiTest {
    public static void main(String[] args) {
        //创建包子
        BaoZi baozi = new BaoZi();
        //创建对象：生产者
        ZuoBaoZi zbz = new ZuoBaoZi(baozi);
        Thread z = new Thread(zbz);
        //创建对象：消费者
        ChiBaoZi cbz = new ChiBaoZi(baozi);
        Thread c = new Thread(cbz);
        z.start();
        c.start();
    }
}
