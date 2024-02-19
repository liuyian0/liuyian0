package com.liu.day01.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        //根据当前集合对象生成迭代器对象
        Iterator<String> it = c.iterator();
        //E next()获取集合中的元素，遍历集合（麻烦）
 /*     System.out.println(it.next());//a
        System.out.println(it.next());//b
        System.out.println(it.next());//c
        System.out.println(it.next());//d*/
        //System.out.println(it.next());//报错

        //boolean hasNext()判断集合中有没有下一个元素
       while (it.hasNext()){
           System.out.println(it.next());
       }

       //使用while循环遍历集合用快捷键：itit

        //void remove()删除当前元素

        //使用增强for遍历数组
        int [] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
        //使用增强for遍历集合
        for (String s : c) {
            System.out.println(s);
        }
    }
}
