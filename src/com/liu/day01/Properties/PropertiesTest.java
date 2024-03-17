package com.liu.day01.Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) {
        //创建集合对象
        Properties pro = new Properties();
        //setProperty()添加数据（保存一对属性）
        pro.setProperty("张三","北京");
        pro.setProperty("赵四","上海");
        pro.setProperty("王老五","广东");
        //对象调用stringPropertyNames()获取所有键的集合，等同于map中的KeySet方法
        Set<String> keys = pro.stringPropertyNames();
        //遍历集合
        for (Iterator<String> it = keys.iterator();it.hasNext();){
            String key = it.next();
            //调用getProperty()根据key获取对应的value
            String value = pro.getProperty(key);
            System.out.println(key+"---"+value);
        }

    }
}
