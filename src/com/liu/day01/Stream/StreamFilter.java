package com.liu.day01.Stream;

import java.util.ArrayList;
import java.util.List;

//使用Stream流筛选出姓张且名字有两个字的人
public class StreamFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("赵四");
        list.add("张杰");
        list.add("张无忌");
        //使用Stream
        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length()==2)
                .forEach(s-> System.out.println(s));
    }
}
