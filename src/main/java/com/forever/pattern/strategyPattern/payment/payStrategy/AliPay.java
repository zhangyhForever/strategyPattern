package com.forever.pattern.strategyPattern.payment.payStrategy;

public class AliPay extends Payment {
    public String getName() {
        return "支付宝";
    }

    public double queryBalance(String uid) {
        return 1000;
    }
}
