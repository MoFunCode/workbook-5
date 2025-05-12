package com.pluralsight.workbook5;

public class Hovercraft extends Vehicle {

    public Hovercraft(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Hovercraft() {
        super("Yellow", 8, 100, 25);
    }
}
