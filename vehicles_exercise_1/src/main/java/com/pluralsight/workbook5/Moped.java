package com.pluralsight.workbook5;

public class Moped extends Vehicle {

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Moped() {
        super("Black", 2, 5, 2);
    }


}
