package com.liu.day02.ReaderWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTest01 {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("D:\\develop\\aaa\\bbb.txt");
        fr.write(97);
        fr.write('b');
        fr.write('c');
        //写出字符数组数据
        char[] c = {'a','b','c','d','e','f'};
        fr.write(c,2,3);
        fr.write("\r");
        fr.write("r");
        fr.write("\n");
        fr.write("n");
        //windows的换行
        fr.write("\r\n");
        fr.write("rn");
        //此时不关闭输出流，无法将字符写入文件中，但是关闭了流对象，无法继续写出数据，需要使用flush方法(刷新缓冲区)
        fr.flush();
        fr.close();


    }
}
