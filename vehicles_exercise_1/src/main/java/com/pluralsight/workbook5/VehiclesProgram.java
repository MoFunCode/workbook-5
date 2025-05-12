package com.pluralsight.workbook5;

public class VehiclesProgram {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);


        Car myCar = new Car();
        SemiTruck truck = new SemiTruck();
        Hovercraft hover = new Hovercraft();

        myCar.setColor("Blue");
        truck.setCargoCapacity(10000);
        hover.setNumberOfPassengers(8);
    }
}
