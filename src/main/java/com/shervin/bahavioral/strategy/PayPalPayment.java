package com.shervin.bahavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("payed " + amount + " using Pay Pal.");
    }
}
