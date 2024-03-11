package com.liu.day01.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建任务对象
        CallableDemo01 cd = new CallableDemo01();
        //获取线程池
        ExecutorService es = Executors.newFixedThreadPool(1);
        //执行任务
        //Future表示异步计算的结果（线程执行完成的结果保存到Future中，再调用Future中的get方法拿到真正的结果）
        Future<Integer> f = es.submit(cd);
        //等待运算结束，获取结果
        Integer i =f.get();
        System.out.println(i);

    }
}
