package com.liu.day02.ObjectStream;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建学生对象
        Student s = new Student("张三",18);
        //创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\develop\\aaa\\c.txt"));
        //使用序列化对象中的方法持久化学生对象
        oos.writeObject(s);
        //关闭资源
        oos.close();
        //创建反序列化对象，指定一个字节输入流用来读取持久文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\develop\\aaa\\c.txt"));
        //使用反序列化对象ois调用函数进行读取数据
        Student s1 = (Student)ois.readObject();
        System.out.println(s1.getName()+"---"+s1.getAge());
        //关闭资源
        ois.close();
    }
}
