package com.liu.day02.digui;
//递归求累和
public class DiGuiDemo01 {
    public static void main(String[] args) {
        //计算1-100的和
        int n = 100;
        //调用求和的方法
        int sum = getSum(n);
        System.out.println(sum);
    }
    private static int getSum(int n) {
     if (n == 1){
         return 1;
     }return n + getSum(n-1);
    }
}
