package com.liu.day02.zhuangshi;

public class XueZhiQianTest {
    public static void main(String[] args) {
        //测试被装饰类
        XueZhiQian x1 = new XueZhiQian();
        x1.sing();
        x1.dance();
        //测试增强类
        BufferedXueZhiQian b = new BufferedXueZhiQian(x1);
        b.sing();
        b.dance();
    }
}
