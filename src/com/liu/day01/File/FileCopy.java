package com.liu.day01.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileInputStream fis = new FileInputStream("D:\\develop\\aaa\\周杰伦 - 断了的弦.FLAC");
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\develop\\aaa\\b.FLAC");
        //记录文件开始复制的时间
        long startTime = System.currentTimeMillis();
        //定义一个数组，记录读取的数据
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = fis.read(b))!=-1){
            //写数据
            fos.write(b,0,len);
        }
        //记录文件复制结束的时间
        long endTime = System.currentTimeMillis();
        System.out.println("文件复制用时："+(endTime-startTime));
        //关闭资源
        fos.close();
        fis.close();
    }
}
