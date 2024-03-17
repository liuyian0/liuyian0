package com.liu.day01.File;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args){
        //记录缓冲流复制文件开始的时间
        long Start = System.currentTimeMillis();
        //创建流对象
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\develop\\aaa\\1.FLAC"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\develop\\aaa\\周杰伦 - 断了的弦.FLAC"));
        ){
            //读写数据
            int b;
            while ((b=bis.read())!=-1){
                bos.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //记录缓冲流复制文件结束的时间
        long end = System.currentTimeMillis();
        System.out.println("缓冲流复制文件用时："+(end-Start));//缓冲流复制文件用时：1221
    }
}
