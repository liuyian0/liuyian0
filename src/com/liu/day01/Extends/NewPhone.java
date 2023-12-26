package com.liu.day01.Extends;

public class NewPhone extends Phone{
    //父类中的方法不足以满足需求，在子类中进行重写
    @Override
    public void call(){
        super.call();
        System.out.println("打游戏...");
    }

}
