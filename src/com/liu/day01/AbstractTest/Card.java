package com.liu.day01.AbstractTest;

public abstract class Card {
    
    // 成员变量
    private String username;
    private double leftMoney;

    // 无参构造
    public Card() {
    };

    // 有参构造
    public Card(String username, double leftMoney) {
        this.username = username;
        this.leftMoney = leftMoney;
    }

    // set/get方法
    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserame() {
        return username;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    // 抽象方法
    public abstract void pay(double money);
}
