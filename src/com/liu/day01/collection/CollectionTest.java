package com.liu.day01.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionTest {
    public static void main(String[] args){
        //多态写法
        Collection<String> c = new ArrayList<>();
        c.add("张三");
        c.add("赵四");
        c.add("王五");
        c.add("刘六");
        c.remove("刘六");
        boolean b1 = c.contains("刘六");
        System.out.println(b1);
        //获取集合长度
        System.out.println(c.size());
        //把集合转成Object[]类型
        Object[] arr = c.toArray();
        //打印数组
        System.out.println(Arrays.toString(arr));
        //把集合转成具体的数据类型（例如String）
        String[] strs = c.toArray(new String[c.size()]);
        System.out.println(Arrays.toString(strs));
    }
}
