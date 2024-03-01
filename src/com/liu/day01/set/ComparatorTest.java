package com.liu.day01.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest {
    public static void main(String[] args) {
        //使用比较器自己定义排序方法
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*o1 - o2 ：升序
                o2 - o1 ：降序
                返回值为正，代表元素放在后面
                返回值为负，代表元素放在前面
                返回值为0，代表元素是重复的，不会存储

                代码中按返回值为元素长度之差，长度一样的两个元素视为重复，只输出其中一个
                */
                return o1.length() - o2.length();
            }
        });
        set.add("aaa");
        set.add("bbbb");
        set.add("abc");
        set.add("cc");
        System.out.println(set);
    }
}
