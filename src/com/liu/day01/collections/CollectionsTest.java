package com.liu.day01.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        System.out.println(list);//[111, 222, 333, 444]
        //static void shuffle(List<?> list)随机打乱集合元素的顺序
        Collections.shuffle(list);
        System.out.println(list);//[111, 333, 444, 222]
        //static <T> void sort(List<?> list) 将集合中的数据按照默认规则排序
        Collections.sort(list);
        System.out.println(list);//[111, 222, 333, 444]
    }
}
