package com.liu.day02.ReaderWriter;

import java.io.FileReader;
import java.io.IOException;

public class ReaderTest02 {
    public static void main(String[] args) throws IOException {
        //创建流对象
        FileReader fr = new FileReader("D:\\develop\\aaa\\a.txt");
        //定义变量，存放有效字符个数
        int len;
        //定义字符数组，存放字符数据
        char[] c = new char[1024];
        //循环读取
        while ((len=fr.read(c))!=-1){
            System.out.println(new String(c,0,len));
        }
        //关闭资源
        fr.close();
    }
}
