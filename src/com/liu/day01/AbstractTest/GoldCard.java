package com.liu.day01.AbstractTest;

public class GoldCard extends Card {
    public GoldCard(String username, double leftMoney) {
        super(username, leftMoney);
    }

    public GoldCard() {
    }

    // 重写父类的pay()方法
    @Override
    public void pay(double money) {
        double leftMoney = getLeftMoney() - money * 0.8;
        setLeftMoney(leftMoney);
        System.out.println(getUserame() + "的卡是金卡，加油享受8折优惠，油价是" + money * 0.8 + ",余额是：" + leftMoney);
    }
}
