package com.liu.day01.map;

import java.util.HashMap;
import java.util.Scanner;

public class CountTest {
    public static void main(String[] args) {
        //判断一串字符串中字母出现的次数
        System.out.println("请输入一个字符串：");
        //1.输入一个字符串
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //2.创建一个集合存储字母及出现的次数
        HashMap<Character, Integer> hm = new HashMap<>();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //判断字母是否出现过
            //字母首次出现
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else {
                //先获取之前出现的次数
                Integer count = hm.get(c);
                count++;
                hm.put(c,count);
            }
        }
        System.out.println(hm);
    }
}
