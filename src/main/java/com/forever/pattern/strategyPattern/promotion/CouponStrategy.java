package com.forever.pattern.strategyPattern.promotion;

public class CouponStrategy implements PromotionStrategy{
    public void doPromotion() {
        System.out.println("使用优惠券，尽享低价");
    }
}
