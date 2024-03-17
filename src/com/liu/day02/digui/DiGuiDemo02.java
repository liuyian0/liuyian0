package com.liu.day02.digui;
//递归求阶乘
public class DiGuiDemo02 {
    public static void main(String[] args) {
        //求10的阶乘
        int result = jc(10);
        System.out.println(result);
    }

    private static int jc(int i) {
        if (i<=1){
            return 1;
        }
        return i*jc(i-1);
    }
}
