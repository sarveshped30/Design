package org.design.commons;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}


//This class contains Overriding as well as Overloading
class AdvanceCalculator extends Calculator {

    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int add(int a, int b) {
        System.out.println("Overrided method");
        return a + b;
    }

}
