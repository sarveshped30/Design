package org.design.commons;

public class Vehicle {

    public String model;
    public String year;

    public Vehicle(String model, String year) {
        System.out.println("Vehicle constructor invoked");
        this.model = model;
        this.year = year;
    }

    public Vehicle() {
        System.out.println("Vehicle constructor invoked");
    }

    void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        System.out.println("Vehicle stopped");
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();

    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car() {
        System.out.println("Car constructor invoked");
    }

    public Car(String model, String year, int numberOfDoors) {
        super(model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}


class Bike extends Vehicle {

    private boolean hasGears;

    public Bike() {
        System.out.println("Bike constructor invoked");
    }

    public Bike(boolean hasGears, String model, String year) {
        super(model, year);
        this.hasGears = hasGears;
    }

    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}



