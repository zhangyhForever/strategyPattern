package com.forever.pattern.strategyPattern.promotion;

public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("没有优惠活动");
    }
}
