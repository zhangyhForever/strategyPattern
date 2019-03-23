package com.forever.pattern.strategyPattern.payment.payStrategy;

public class UnionPay extends Payment {
    public String getName() {
        return "云闪付";
    }

    public double queryBalance(String uid) {
        return 200;
    }
}
