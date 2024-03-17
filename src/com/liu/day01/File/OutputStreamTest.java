package com.liu.day01.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {
    public static void main(String[] args)throws IOException{
        //创建流对象
        //1.使用File对象创建流对象
        File file = new File("D:\\develop\\aaa\\a.txt");
        //public FileOutputStream(String name,boolean append)
        //boolean append，true表示追加数据，false表示清空原有数据
        FileOutputStream fos = new FileOutputStream(file);
        //2.使用文件名称创建流对象
        //FileOutputStream fos = new FileOutputStream("D:\\develop\\aaa\\a.txt");


        //write(int b)写出一个字节数据
        fos.write(97);
        fos.write(98);
        fos.write(99);
        //write(byte[] b)写出字节数组
        byte[] b = "张三".getBytes();
        fos.write(b);
        //write(byte[] b,int off,int len),写出指定长度（从off索引开始，len个字节）字节数组
        byte[] y = "abcdefg".getBytes();
        fos.write(y,2,4);
        //System.lineSeparator():实现跨平台换行
        fos.write(("a"+System.lineSeparator()+"b").getBytes());//输出结果为：a换行b
        //关闭资源
        fos.close();
    }
}
