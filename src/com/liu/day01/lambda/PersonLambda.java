package com.liu.day01.lambda;

import java.util.Arrays;

public class PersonLambda {
    public static void main(String[] args) {
        Person[] arr = {new Person("张三",18),new Person("赵四",17),new Person("王五",19)};
        //Lambda写法
        Arrays.sort(arr,(Person a,Person b)->{
            return a.getAge() - b.getAge();
        });
        for (Person person : arr) {
            System.out.println(person);
        }
        /*
        Lambda省略写法：
        1.小括号内的参数类型可以省略
        2.小括号内有且仅有一个参数时，小括号可以省略
        3.大括号内有且仅有一个语句，无论是否有返回值，都可以省略大括号，return关键字及语句分号
         */
    }
}
