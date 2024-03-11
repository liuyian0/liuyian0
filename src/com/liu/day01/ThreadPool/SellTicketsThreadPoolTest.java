package com.liu.day01.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SellTicketsThreadPoolTest {
    public static void main(String[] args) {
        //创建任务类对象
        SellTicketsThreadPool sttp = new SellTicketsThreadPool();
        //获取线程池对象（4个）
        ExecutorService es = Executors.newFixedThreadPool(4);
        //直接执行任务
        //submit获取线程池中的某一个线程对象，调用run(),需要几个就重复写几次
        es.submit(sttp);
        es.submit(sttp);
        es.submit(sttp);
        es.submit(sttp);

    }
}
