package com.liu.day01.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Traverse {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        //put添加指定的键和值添加到集合
        map.put(1, "张三");
        map.put(2, "赵四");
        map.put(3, "王五");
        //分析：
        //1.获取Map中所有的键，返回一个Set集合存储所有的键
        Set<Integer> set1 = map.keySet();
        //2.遍历键的Set集合
        for (Integer key : set1) {
            //3.根据键获取对应的值
            String value = map.get(key);
            System.out.println("键是" + key + ",值是" + value);
        }
        //该方法中，keySet（）方法遍历了一次集合，get（）方法又遍历了一次集合，效率较低!
        /*在Map集合中提供了获取所有键值对（Entry）对象的方法：
          public Set<Map.Entry<k,v>> entrySet()
          getKey/getValue获取键值对的键和值
         */
        Set<Map.Entry<Integer,String>> set2 = map.entrySet();
        for (Map.Entry<Integer, String> entry : set2) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("键是" + key + ",值是" + value);
        }
    }
}
