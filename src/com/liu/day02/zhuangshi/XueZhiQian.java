package com.liu.day02.zhuangshi;

//被装饰类
public class XueZhiQian implements Idols{
    @Override
    public void sing() {
        System.out.println("薛之谦唱天外来物");
    }

    @Override
    public void dance() {
        System.out.println("薛之谦跳科目三");
    }
}
