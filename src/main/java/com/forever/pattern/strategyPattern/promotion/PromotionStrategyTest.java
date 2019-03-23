package com.forever.pattern.strategyPattern.promotion;

public class PromotionStrategyTest {

    public static void main(String[] args) {
       /* PromotionActivity promotionActivity = new PromotionActivity(new GroupBuyStrategy());
        promotionActivity.execute();*/

        PromotionStrategy promotionStrategy = PromotionStrategyFactory.getPromotionStrategy("GROUP_BUY");
        new PromotionActivity(promotionStrategy).execute();
    }
}
