package com.liu.day01.Stream;

import java.util.ArrayList;
import java.util.List;

//传统写法筛选出姓张且名字有两个字的人
public class NormalFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("赵四");
        list.add("张杰");
        list.add("张无忌");
        //筛选出姓张的名字，并存放到集合ZhangList中
        List<String> ZhangList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")){
                ZhangList.add(s);
            }
        }
        //再筛选出名字有两个字的，并存放到集合ShortList中
        List<String> ShortList = new ArrayList<>();
        for (String s : ZhangList) {
            if (s.length()==2){
                ShortList.add(s);
            }
        }
        for (String s : ShortList) {
            System.out.println(s);
        }
    }
}
