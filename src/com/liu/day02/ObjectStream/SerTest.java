package com.liu.day02.ObjectStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SerTest {
    public static void main(String[] args) throws Exception{
        //创建学生对象
        Student s1 = new Student("张三",18);
        Student s2 = new Student("赵四",29);
        Student s3 = new Student("王老五",19);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        //序列化操作
        serialize(arr);
        //反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\develop\\aaa\\d.txt"));
        //读取对象，强转为ArrayList类型
        ArrayList<Student> array = (ArrayList<Student>) ois.readObject();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName()+"---"+s.getAge());
        }
        //释放资源
        ois.close();
    }

    private static void serialize(ArrayList<Student> arr) throws Exception{
        //创建序列化流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\develop\\aaa\\d.txt"));
        //写出对象
        oos.writeObject(arr);
        //释放资源
        oos.close();
    }
}
