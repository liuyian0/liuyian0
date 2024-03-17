package com.liu.day02.digui;

import java.io.File;

//递归打印所有子目录中的文件路径
public class DiGuiDemo03 {
    public static void main(String[] args) {
        //封装父目录的对象
        File parent = new File("D:\\develop\\aaa");
        //调用函数查文件或文件夹
        scanFolderAndFile(parent);
    }

    private static void scanFolderAndFile(File parent) {
        //获取所有子
        File[] dirs = parent.listFiles();
        //循环遍历所有子
        for (File dir : dirs) {
            //判断子是否为文件夹
            if (dir.isDirectory()){
                //是文件夹就再次向下一级调用函数
                scanFolderAndFile(dir);
            }else{
                //不是文件夹就是文件,返回其路径
                System.out.println(dir.getAbsolutePath());
            }
        }
    }
}
