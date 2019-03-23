package com.forever.pattern.strategyPattern.payment;

import com.forever.pattern.strategyPattern.payment.payStrategy.*;

import java.util.HashMap;
import java.util.Map;

public class PayStategy {

    public static final String ALI_PAY = "AliPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String UNION_PAY = "UnionPay";
    public static final String JD_PAY = "JDPay";
    public static final String DEFAULT_PAY = ALI_PAY;

    private static Map<String, Payment> paystategy = new HashMap<String, Payment>();

    static {
        paystategy.put(ALI_PAY, new AliPay());
        paystategy.put(WECHAT_PAY, new WechatPay());
        paystategy.put(UNION_PAY, new UnionPay());
        paystategy.put(JD_PAY, new JDPay());
    }

    //通过统一入口实现动态分配
    public static Payment get(String key){
        if(!paystategy.containsKey(key)){
            return paystategy.get(DEFAULT_PAY);
        }
        return paystategy.get(key);
    }

}
