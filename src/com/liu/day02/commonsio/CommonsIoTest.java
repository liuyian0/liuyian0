package com.liu.day02.commonsio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CommonsIoTest {
    public static void main(String[] args) throws Exception{
        //输入流
        FileInputStream fis = new FileInputStream("D:\\develop\\aaa\\e.txt");
        //输出流
        FileOutputStream fos = new FileOutputStream("D:\\develop\\aaa\\f.txt");
        //复制
        //IOUtils类
        IOUtils.copy(fis,fos);
        //关闭资源
        fis.close();
        fos.close();
        //复制文件到另一个文件夹(f1-f2)
        File f1 = new File("F:\\1.mp3");
        File f2 = new File("G:\\");
        FileUtils.copyFileToDirectory(f1,f2);
        //复制文件夹(f3-f4)
        File f3 = new File("F:\\develop");
        File f4 = new File("G:\\");
        FileUtils.copyDirectoryToDirectory(f3,f4);
    }
}
