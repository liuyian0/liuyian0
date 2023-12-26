package com.liu.day01.Extends;

public class Zi extends Fu{
    int x = 100;
    void show(){
        int x = 1000;
    System.out.println("x = "+  x);//x = 1000
    System.out.println("this.x = "+this.x);// this.x = 100
    System.out.println("super.x = "+super.x);// super.x = 10

    }
}
