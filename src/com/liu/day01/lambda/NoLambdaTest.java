package com.liu.day01.lambda;
//传统方法启动一个线程
public class NoLambdaTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("传统方法启动线程...");
            }
        }).start();
    }
}
