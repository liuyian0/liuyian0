package com.liu.day01.AbstractTest;

public class SilverCard extends Card {
    public SilverCard(String username, double leftMoney) {
        super(username, leftMoney);
    }

    public SilverCard() {
    }

    @Override
    public void pay(double money) {
        double leftMoney = getLeftMoney() - money * 0.85;
        setLeftMoney(leftMoney);
        System.out.println(getUserame() + "的卡是银卡，加油享受8.5折优惠，油价是：" + money * 0.85 + ",余额是：" + leftMoney);
    }
}
