package org.design.commons;

import org.design.exceptions.InsufficientBalanceException;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigDecimal;
import java.sql.SQLClientInfoException;

public class ExceptionPolymorphism {



}



class Device {

     protected Number doSomething() throws InsufficientBalanceException {
        System.out.println("device..");
        return 0;
    }
}



class Mobile extends Device  {

    @Override
    public BigDecimal doSomething() throws InsufficientBalanceException {
        System.out.println("mobile..");
        return BigDecimal.ZERO;
    }

}
