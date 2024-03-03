package com.liu.day01.exception;

public class Zi extends Fu {
    public void method (){
        System.out.println("子类重写父类方法");
        try {
            throw new Exception("子类产生异常") ;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
