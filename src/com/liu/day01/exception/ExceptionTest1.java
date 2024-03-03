package com.liu.day01.exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        /*捕获异常try...catch
        格式：try{
        编写可能会出现异常的代码
        }catch（异常类型  对象名）{
        处理异常的代码
        }
         */
        try {
            show(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void show(int i) throws Exception {
        if (i == 0){
            throw new Exception("i不能为0");
        }
        System.out.println(i);
    }
}
