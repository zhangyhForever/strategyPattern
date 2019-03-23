package com.forever.pattern.strategyPattern.payment;

import com.forever.pattern.strategyPattern.payment.payStrategy.Payment;

public class Order {

    private String uid;
    private String oid;
    private double amount;

    public Order(String uid, String oid, double amount) {
        this.uid = uid;
        this.oid = oid;
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public MsgResult pay(String key){
        Payment payment = PayStategy.get(key);
        System.out.println("欢迎使用"+payment.getName());
        System.out.println("本次交易金额："+amount+"，扣款中。。。。");
        return payment.pay(uid, amount);
    }
}
