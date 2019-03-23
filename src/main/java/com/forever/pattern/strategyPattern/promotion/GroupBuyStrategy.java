package com.forever.pattern.strategyPattern.promotion;

public class GroupBuyStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("20人团购，集齐人数即可获得团购价格");
    }
}
