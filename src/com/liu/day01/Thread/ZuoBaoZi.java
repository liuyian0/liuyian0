package com.liu.day01.Thread;

public class ZuoBaoZi implements Runnable{
    //成员变量
    BaoZi baozi;
    //构造方法
    public ZuoBaoZi(BaoZi baozi) {
        this.baozi = baozi;
    }
    @Override
    public void run() {
     //做包子
     while (true){
         synchronized("lock"){
             //如果有包子就不用制作,制作进入等待
             if (baozi.flag == true){
                 try {
                     "lock".wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }else {
                 //没有包子，进入制作过程
                 baozi.pi = "面粉";
                 baozi.xian = "韭菜鸡蛋";
                 //修改包子状态
                 baozi.flag = true;
                 System.out.println("包子制作完成...");
                 //唤醒消费者
                 "lock".notify();
             }
         }
     }
    }
}
