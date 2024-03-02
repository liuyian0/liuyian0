package com.liu.day01.test;

public class ChangeArgs {
    public static void main(String[] args) {
        /*定义一个方法需要接受多个参数，并且多个参数类型一致
        格式：修饰符 返回值类型 方法名（参数类型...形参名）
        tips:1.一个方法只能有一个可变参数
             2.如果方法中有多个参数，可变参数要放在最后
        */
        method();
        method(10);
        method(10,20);
        //也可以传入一个数组（可变参数的本质就是一个数组）
        int[] arr = {10,20,30,40};
        method(arr);
    }

    private static void method(int ... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
