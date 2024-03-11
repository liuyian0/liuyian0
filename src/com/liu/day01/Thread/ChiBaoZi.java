package com.liu.day01.Thread;

public class ChiBaoZi implements Runnable{
    //成员变量
    BaoZi baozi ;
    //构造方法
    public ChiBaoZi(BaoZi baozi) {
        this.baozi = baozi;
    }
    @Override
    public void run() {
    //吃包子
    while (true){
        synchronized("lock"){
            //没包子
            if (baozi.flag == false){
                try {
                    "lock".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                System.out.println("吃掉一个"+baozi.pi+baozi.xian+" 的包子");
                baozi.pi = null;
                baozi.xian = null;
                baozi.flag = false;
                //唤醒制作包子
                "lock".notify();
            }
        }
    }
    }
}
