package com.liu.day01.map;

import java.util.*;

public class Sons {
    //Map的子类
    public static void main(String[] args) {
        /* 一、HashMap
            1.线程不安全
            2.效率高
            3.键和值都可以为null，只能有一个null key（底层有哈希表）保证键唯一
            4.存取无序
           LinkedHashMap，底层有哈希表和双重链表（保证存取顺序）
           二、HashTable
            1.效率低
            2.线程安全
            3.键和值不能为null
           ConCurrentHashMap采用分段锁，效率高，而且安全
           三、TreeMap(底层结构为红黑树，可以对元素的键进行排序，包括自然排序和比较器排序)
         */
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(18,"张三");
        hm.put(17,"赵四");
        hm.put(19,"王五");
        hm.put(null,null);
        hm.put(null,"刘六");
        Set<Map.Entry<Integer, String>> entry1 = hm.entrySet();
        for (Map.Entry<Integer, String> entry : entry1) {
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
        //TreeMap 比较器排序(比较器匹配的数据只能是键的值)
        TreeMap<Student,Integer> tm = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        });
        tm.put(new Student("张三",18,"男"),7);
        tm.put(new Student("赵四",17,"女"),5);
        tm.put(new Student("王五",19,"男"),1);
        System.out.println(tm);
    }
}
