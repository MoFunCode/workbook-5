package com.pluralsight.workbook5;

public class SemiTruck extends Vehicle {

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public SemiTruck() {
        super("White", 2, 53000, 150);
    }
}
