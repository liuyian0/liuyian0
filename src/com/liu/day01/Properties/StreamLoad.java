package com.liu.day01.Properties;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class StreamLoad {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        Properties prop = new Properties();
        //调用load()函数加载硬盘上的数据
        prop.load(new FileReader("D:\\develop\\aaa\\a.txt"));
        //获取所有键的集合
        Set<String> keys = prop.stringPropertyNames();
        //遍历集合
        for (Iterator<String> it = keys.iterator();it.hasNext();){
            String key = it.next();
            //根据建获取对应的值
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
