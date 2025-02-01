package org.design.commons;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("Payment processed via CreditCard");
    }

    @Override
    public void refundPayment() {
        System.out.println("Payment refunded via CreditCard");
    }
}
