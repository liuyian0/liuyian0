package com.liu.day01.exception;

public class ExceptionTest {
    public static void main(String[] args) {
        /*
        Error:严重问题，通过代码无法处理（如内存溢出）
        Exception:异常类，表示程序本身可以处理的问题
            RuntimeException（运行时异常），在运行时期，检查异常，运行异常不会让编译器检测（不报错）
            逻辑错误，需要选择性地捕获，在运行时抛出
            CheckedException（受检异常），在编译时期就会检查异常，如果没有处理异常，则编译失败
            外部环境或资源问题，必须显式地进行处理，否则编辑器出错

            异常处理：try,catch,finally,throw,throws
         */
        int[] arr = {1,2,3,4,5};
        int element = getElement(arr,5);
        System.out.println(element);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 你的角标越界了
        //	at com.liu.day01.exception.ExceptionTest.getElement(ExceptionTest.java:23)
        //	at com.liu.day01.exception.ExceptionTest.main(ExceptionTest.java:16)
    }
    private static int getElement(int[] arr, int index) {
        //判断索引是否越界
        if (index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("你的角标越界了");
        }
        int element = arr[index];
        return element;
    }
}
