package com.liu.day02.zhuangshi;

//增强类，装饰类
public class BufferedXueZhiQian implements Idols {
    //被装饰类的对象作为成员变量
    private XueZhiQian xzq;
    //构造方法

    public BufferedXueZhiQian(XueZhiQian xzq) {
        this.xzq = xzq;
    }

    @Override
    public void sing() {
        System.out.println("薛之谦唱演员");
    }

    @Override
    public void dance() {
        xzq.dance();
    }
}
