package com.liu.day01.Stream;

import java.util.stream.Stream;

public class Method {
    public static void main(String[] args) {
        /*
        Stream流常用方法：
        终结方法（返回值不再是Stream接口自身类型的方法）：count（统计个数）和forEach（逐一处理）
        非终结方法（返回值仍是Stream接口自身类型的方法）：其余方法
         */
        String[] arr = {"张三","赵四","王五","刘六"};
        Stream<String> arrayStream = Stream.of(arr);
        //forEach逐一处理
        arrayStream.forEach((String name)-> {System.out.println(name);});
        //filter过滤

        //Stream API只能被消费一次，后续重复使用已建立的流会报异常！所以stream流是线程安全的
        //所以这里要创建一个新的Stream流↓
        Stream<String> arrStream = Stream.of(arr);
        Stream<String> shortName = arrStream.filter(s -> s.length()==2);
        //count统计个数
        System.out.println(shortName.count());//4
        //limit取用前几个
        Stream<String> brrStream = Stream.of(arr);
        Stream<String> limitNo = brrStream.limit(2);
        System.out.println(limitNo.count());//2
        //skip跳过前几个
        Stream<String> crrStream = Stream.of(arr);
        Stream<String> skipNo = crrStream.skip(3);
        System.out.println(skipNo.count());//1
        //concat组合
        Stream<String> streamA = Stream.of("张三");
        Stream<String> streamB = Stream.of("赵四");
        Stream<String> StreamAB = Stream.concat(streamA,streamB);
    }
}
