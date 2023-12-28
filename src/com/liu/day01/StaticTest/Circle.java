package com.liu.day01.StaticTest;

public class Circle {
    //定义圆的半径
    private double r;
    //定义圆周率
    private static double PI = 3.14;
    //构造函数
    Circle(double r){
        this.r = r;
    }
    double getArea(){
        return r*r*PI;
    }
}
