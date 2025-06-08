package com.shervin.bahavioral.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(500_000);
    }
}
