package com.liu.day02.ReaderWriter;

import java.io.*;

public class CharacterEncodingTest {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\develop\\aaa\\a.txt"));
        //创建输入流对象，并指定编码GBK
        InputStreamReader isr1 = new InputStreamReader(new FileInputStream("D:\\develop\\aaa\\a.txt"),"GBK");
        //创建输出流对象，并指定编码GBK，再进行循环读写，就可以实现编码转换
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\develop\\aaa\\b.txt"),"GBK");
        //定义变量，保存字符
        int len;
        //循环读取
        while ((len=isr.read())!=-1){
            System.out.println((char) len);
            osw.write(len);
        }//采用默认编码utf8，正常输出结果
        //关闭资源
        isr.close();
        osw.close();
        while ((len=isr1.read())!=-1){
            System.out.println((char) len);
        }//采用指定编码GBK，输出乱码
        //关闭资源
        isr1.close();
    }
}
