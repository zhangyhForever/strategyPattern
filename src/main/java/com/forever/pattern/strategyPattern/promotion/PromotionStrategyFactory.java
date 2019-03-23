package com.forever.pattern.strategyPattern.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

   /* private static String GROUP_BUY = "GROUP_BUY";
    private static String COUPON = "COUPON";
    private static String EMPTY = "EMPTY";
    private static String CASHBACK = "CASHBACK";*/
    private static Map<String, PromotionStrategy> promotionStrategyMap = new HashMap<String, PromotionStrategy>();

    static{
        /*promotionStrategyMap.put(GROUP_BUY, new GroupBuyStrategy());
        promotionStrategyMap.put(COUPON, new CouponStrategy());
        promotionStrategyMap.put(EMPTY, new EmptyStrategy());
        promotionStrategyMap.put(CASHBACK, new CashbackStrategy());*/
        promotionStrategyMap.put(PromotionKey.GROUP_BUY, new GroupBuyStrategy());
        promotionStrategyMap.put(PromotionKey.COUPON, new CouponStrategy());
        promotionStrategyMap.put(PromotionKey.EMPTY, new EmptyStrategy());
        promotionStrategyMap.put(PromotionKey.CASHBACK, new CashbackStrategy());
    }

    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey){
        return promotionStrategyMap.get(promotionKey);
    }

    private interface PromotionKey{
        String GROUP_BUY = "GROUP_BUY";
        String COUPON = "COUPON";
        String EMPTY = "EMPTY";
        String CASHBACK = "CASHBACK";
    }
}
