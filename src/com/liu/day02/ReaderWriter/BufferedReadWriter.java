package com.liu.day02.ReaderWriter;

import java.io.*;

public class BufferedReadWriter {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲流
        BufferedReader br = new BufferedReader(new FileReader("D:\\develop\\aaa\\bbb.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\develop\\aaa\\ccc.txt"));
        //读取资源
        String line;
        //循环读取，最后返回null
        while ((line = br.readLine())!=null){
            System.out.println(line);
            bw.write(line);
            //换行
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
