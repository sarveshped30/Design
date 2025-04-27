package org.design.commons;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.printf("Something in myThread name :: %s", Thread.currentThread().getName());
    }
}
