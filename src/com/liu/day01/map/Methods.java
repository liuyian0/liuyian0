package com.liu.day01.map;

import java.util.HashMap;

public class Methods {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        //put添加指定的键和值添加到集合
        map.put(1,"张三");
        map.put(2,"赵四");
        map.put(3,"王五");
        System.out.println(map);//{1=张三, 2=赵四, 3=王五}
        //当put添加的键与已存在的键相同时，则覆盖其对应的值，并返回原来的值
        //当添加新元素（集合中不存在相同键的元素）时，返回的值为null
        String s = map.put(3, "刘六");
        System.out.println(s);//王五
        //remove删除指定的键及对应的值，并返回被删除元素的值
        System.out.println(map.remove(2));//赵四
        System.out.println(map);//{1=张三, 3=刘六}
        map.put(2,"赵四");
        //get根据建获取对应的值
        System.out.println(map.get(2));
        //containsKey/containsValue判断是否包含对应的键/值
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("王五"));
    }
}
