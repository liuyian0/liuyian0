package com.liu.day01.AbstractTest;

public class CardTest{
    public static void main(String[] args) {
        GoldCard gc = new GoldCard("张三",10000);
        gc.pay(300);
        SilverCard sc = new SilverCard("赵四",5000);
        sc.pay(300);
    }
}
