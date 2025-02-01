package org.design.commons;

import org.design.exceptions.InsufficientBalanceException;

public interface Payment {

    public abstract void processPayment() throws Exception;

    public abstract void refundPayment() throws IllegalArgumentException, InsufficientBalanceException;

    static void healthCheck() {
        System.out.println("Up and alive");
    }

     default void transactionMessage() {
        System.out.println("thank you for the transaction");
    }
}
