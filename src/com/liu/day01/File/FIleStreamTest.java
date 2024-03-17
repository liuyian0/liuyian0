package com.liu.day01.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleStreamTest {
    public static void main(String[] args) throws IOException {
        //记录字节流复制文件开始的时间
        long start = System.currentTimeMillis();
        //创建字节流
        FileInputStream fis = new FileInputStream("D:\\develop\\aaa\\1.FLAC");
        FileOutputStream fos = new FileOutputStream("D:\\develop\\aaa\\2.FLAC");
        //读写数据
        int a;
        while ((a=fis.read())!=-1){
            fos.write(a);
        }
        //记录字节流复制文件结束的时间
        long end = System.currentTimeMillis();
        System.out.println("字节流复制文件用时："+(end-start));//字节流复制文件用时：202512
        //关闭资源
        fis.close();
        fos.close();
    }
}
