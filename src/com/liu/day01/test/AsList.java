package com.liu.day01.test;

import java.util.Arrays;
import java.util.List;

public class AsList {
    public static void main(String[] args) {
        /*数组转化为集合
        使用工具类Arrays调用asList方法将数组中的数据放到list中
        ！！！数组必须是包装类型，不能是基本类型(基本类型会将数组的地址值放到list中)
         */
        Integer[] arr = {10,20,30};
        List<Integer> list1 = Arrays.asList(arr);
        System.out.println(list1);
        //[10, 20, 30]
        int[] brr = {10,20,30};
        List<int[]> list2 = Arrays.asList(brr);
        System.out.println(list2.size());//1
        System.out.println(list2);//[[I@1b6d3586] <-数组的地址值
    }
}
