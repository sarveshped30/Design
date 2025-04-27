package org.design;

import org.design.commons.MyThread;
import org.design.enums.AccountType;

import java.util.Optional;

public class Design {

    public static void main(String[] args) {

        System.out.println(AccountType.SAVINGS_ACCOUNT.getType());
        System.out.println(AccountType.CURRENT_ACCOUNT.name());         //Name comes from Enums abstract class
        System.out.printf("Thread name :: %s", Thread.currentThread().getName());
        System.out.println();
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
