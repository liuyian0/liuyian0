package com.liu.day01.File;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建输入流
        FileInputStream fis = new FileInputStream("D:\\develop\\aaa\\a.txt");
        //调用read()方法实现数据的读取，当读取结果为-1时，代表读取完毕
        int i = fis.read();
        while (i != -1){
            System.out.println((char) i);
            //i重新赋值，可以理解为移动光标
            i = fis.read();

        }
        //以上写法可以简化为↓
        int b = 0;
        while ((b=fis.read())!= -1){
            System.out.println((char) b);
        }
        fis.close();
    }
}
