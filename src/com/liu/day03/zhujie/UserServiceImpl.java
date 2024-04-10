package com.liu.day03.zhujie;

//定义实现类UserServiceImpl实现UserService，并完成相关功能，并统计耗时
public class UserServiceImpl implements UserService{
    @Override
    public void login() {
        try {
            //1.记录该功能开始执行的时间
            long start = System.currentTimeMillis();
            System.out.println("登录");
            //2.将线程休眠模仿功能执行
            Thread.sleep(3000);
            //3.记录该功能执行结束的时间
            long end = System.currentTimeMillis();
            //4.计算耗时
            System.out.println("耗时："+(end-start));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void delete() {
        try {
            //1.记录该功能开始执行的时间
            long start = System.currentTimeMillis();
            System.out.println("删除");
            //2.将线程休眠模仿功能执行
            Thread.sleep(4000);
            //3.记录该功能执行结束的时间
            long end = System.currentTimeMillis();
            //4.计算耗时
            System.out.println("耗时："+(end-start));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void query() {
        try {
        //1.记录该功能开始执行的时间
        long start = System.currentTimeMillis();
        System.out.println("查询");
        //2.将线程休眠模仿功能执行
        Thread.sleep(1000);
        //3.记录该功能执行结束的时间
        long end = System.currentTimeMillis();
        //4.计算耗时
        System.out.println("耗时："+(end-start));
    }catch (Exception e){
        e.printStackTrace();
    }
    }
}
