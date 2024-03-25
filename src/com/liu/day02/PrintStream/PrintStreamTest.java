package com.liu.day02.PrintStream;

import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) throws Exception{
        //创建打印流，指定文件的名称
        PrintStream ps = new PrintStream("D:\\develop\\aaa\\e.txt");
        //直接使用对象调用方法输出到指定文件
        ps.println(100);;
        //设置系统的打印流流向，输出到e.txt，后面打印的都输出到文件中
        System.setOut(ps);
        System.out.println("setOut");

        //打印流自动刷新
        System.out.println(1);
        System.out.println(true);
        //关闭资源
        ps.close();
    }
}
