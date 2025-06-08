package com.shervin.bahavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("payed " + amount + " using Credit Card.");
    }
}
