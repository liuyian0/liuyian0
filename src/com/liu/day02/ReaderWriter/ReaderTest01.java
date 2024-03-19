package com.liu.day02.ReaderWriter;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest01 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        FileReader fr = new FileReader("D:\\develop\\aaa\\a.txt");
        //定义变量，存放有效字符个数
        int len;
        //read一次读取一个字符
        while ((len=fr.read())!=-1){
            System.out.println((char) len);
        }
        //释放资源
        fr.close();
    }
}
