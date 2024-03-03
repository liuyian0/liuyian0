package com.liu.day01.exception;

public class FinallyTest {
    public static void main(String[] args) {
        /*  try...catch...finally
        try{
            可能发生异常的代码
            }catch（异常类型  对象名）{
            处理异常的代码
            }finally{
            程序中永远都能执行的代码
            }

            注意：finally不能单独使用
            常用于IO流最终关闭资源
         */
        show(0);
        /*
        show(0):程序输出结果为catch...finally...
        show(1):程序输出结果为try...finally...
         */
    }
    private static void show(int i) {
        try {
            if (i == 0){
                throw new Exception("i不能为0");
            }
            System.out.print("try...");
        } catch (Exception e) {
            System.out.print("catch...");
        }finally {
            System.out.print("finally...");
        }
    }
}
