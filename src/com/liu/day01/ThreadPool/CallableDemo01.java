package com.liu.day01.ThreadPool;

import java.util.concurrent.Callable;

public class CallableDemo01 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
        return null;
    }
}
