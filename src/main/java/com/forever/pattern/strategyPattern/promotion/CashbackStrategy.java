package com.forever.pattern.strategyPattern.promotion;

public class CashbackStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("返现活动，返现金额将发放至支付宝");
    }
}
