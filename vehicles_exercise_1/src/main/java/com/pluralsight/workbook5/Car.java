package com.pluralsight.workbook5;

public class Car extends Vehicle {

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public Car() {
        super("White", 5, 50, 15);
    }


}
