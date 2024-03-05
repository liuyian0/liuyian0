package com.liu.day01.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectStream {
    public static void main(String[] args) {
        /*
        收集Stream结果
        1.收集到集合中
        toList，toSet
         */
        Stream<String> streamA = Stream.of("张三","赵四","王五","刘六");
        List<String> list = streamA.collect(Collectors.toList());
        Stream<String> streamB = Stream.of("张三","赵四","王五","刘六");
        Set<String> set = streamB.collect(Collectors.toSet());
        System.out.println("list:"+list+",set:"+set);
        /*
        2.收集到数组中
        Object[] toArray
         */
        Stream<String> streamC = Stream.of("张三","赵四","王五","刘六");
        Object[] arr = streamC.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
