package com.forever.pattern.strategyPattern.payment;

public class PayStategyTest {

    public static void main(String[] args) {
        Order order = new Order("1", "12342323", 300);
        MsgResult msgResult = order.pay(PayStategy.UNION_PAY);
        System.out.println(msgResult);
    }
}
