package com.liu.day01.File;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest1 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileInputStream fis = new FileInputStream("D:\\develop\\aaa\\a.txt");
        //定义一个数组保存字节数据
        //[len]:读取到的字节的个数len,每次最多可以从文件中读取1024个字节数据
        byte[] b = new byte[3];
        //读取数据，保存到数组中
        //len返回的是读取到的字节数
        int len;
/*        int len = fis.read(b);
        System.out.println(new String(b,0,len));*/
        while ((len = fis.read(b)) != -1) {
            System.out.println(new String(b));
        }
        //关闭资源
        fis.close();
    }
}
