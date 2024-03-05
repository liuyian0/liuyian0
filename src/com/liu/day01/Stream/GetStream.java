package com.liu.day01.Stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class GetStream {
    public static void main(String[] args) {
        //获取Stream流的方法
            //1.根据Collection获取流
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();
        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();
        //2.根据数组获取流
        String[] arr = {"张三","赵四","王五","刘六"};
        Stream<String> arrayStream = Stream.of(arr);
        Stream<String> arrStream = Stream.of("张三","赵四","王五","刘六");
    }
}
