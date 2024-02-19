package com.liu.day01.set;

import java.util.HashSet;
/*
* HashSet是Set接口的一个实现类，存储的元素不能重复，元素无序
* */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("abc");
        hs.add("asd");
        hs.add("abd");
        hs.add("abc");
        System.out.println(hs);//[abd, abc, asd]
    }
}
