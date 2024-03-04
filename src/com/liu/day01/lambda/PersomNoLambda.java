package com.liu.day01.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PersomNoLambda {
    public static void main(String[] args) {
        //使用传统写法对数组内容进行比较排序
        Person[] arr = {new Person("张三",18),new Person("赵四",17),new Person("王五",19)};
        Comparator<Person> com = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(arr,com);
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
