package com.forever.pattern.strategyPattern.payment.payStrategy;

import com.forever.pattern.strategyPattern.payment.MsgResult;

public abstract class Payment {

    public abstract String getName();

    public abstract double queryBalance(String uid);

    public MsgResult pay(String uid, double amount){
        if(queryBalance(uid) < amount){
            return new MsgResult(500, "支付失败","您的余额不足，请更换支付方式");
        }
        return new MsgResult(200,"支付成功","支付金额：" + amount);
    }
}
