package org.design.commons;

import org.design.exceptions.InsufficientBalanceException;

public class UPIPayment implements Payment{

    @Override
    public void processPayment() throws Exception{
        System.out.println("Payment processed via UPI");
    }

    @Override
    public void refundPayment() throws InsufficientBalanceException {
        System.out.println("Payment refunded via UPI");
        throw new InsufficientBalanceException("sjdbd");
    }
}
