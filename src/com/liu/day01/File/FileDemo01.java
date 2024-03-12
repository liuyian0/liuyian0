package com.liu.day01.File;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        //根据文件或者文件夹的路径名创建一个File对象（绝对路径）
        //1.通过文件路径名
        String pathname = "D:\\develop\\aaa\\aaa.txt";
        File file1 = new File(pathname);
        //2.通过父路径和子路径字符串
        String fu = "D:\\aaa";
        String zi = "bbb.txt";
        File file2 = new File(fu,zi);
        //3.通过父级File对象和子路径字符串
        File fuDir = new File("D:\\aa");
        String ziFile = "aaa.txt";
        File file3 = new File(fuDir,ziFile);
        //相对路径(项目下的1.txt文件)
        File file4 = new File("1.txt");
        //获取文件的绝对路径
        System.out.println(file1.getAbsolutePath());
        //获取文件名
        System.out.println(file2.getName());
        //获取File类中封装的所有内容
        System.out.println(file3.getPath());
        //获取文件大小
        System.out.println(file1.length());
        //判断是否存在
        System.out.println(file1.exists());
        //判断是否为文件夹
        System.out.println(file1.isDirectory());
        //判断是否为文件
        System.out.println(file1.isFile());
        //创建目录
        File dir1 = new File("D:\\aaa");
        //目录是否创建成功
        System.out.println(dir1.mkdir());//true
        //创建多级目录
        File dir2 = new File("D:\\aaa\\bbb");
        System.out.println(dir2.mkdir());//false
        //多级目录是否创建成功
        System.out.println(dir2.mkdirs());//true
        //删除目录（直接删除，不过回收站）
        System.out.println(dir1.delete());//true
        System.out.println(dir2.delete());//false(目录必须为空才能删除)
        //获取当前目录下的文件及文件夹的名称
        String[] names =dir2.list();
        for (String name : names) {
            System.out.println(name);
        }
        //获取当前目录下的文件及文件夹
        File[] files = dir2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
