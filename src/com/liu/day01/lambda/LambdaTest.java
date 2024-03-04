package com.liu.day01.lambda;
/*\
    Lambda简化启动一个线程
    Lambda表达式的标准格式：(参数类型 参数名称，参数类型 参数名称，...)->{代码语句}
    小括号内无参数则留空，多个参数逗号隔开
 */
public class LambdaTest {
    public static void main(String[] args) {
        new Thread(()-> System.out.println("Lambda启动线程...")).start();
    }
}
