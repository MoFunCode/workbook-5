package com.pluralsight.workbook5;

public class VehiclesProgram {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        System.out.println("Default Moped Color: " + slowRide.getColor() + ", Fuel: " + slowRide.getFuelCapacity());

        Car sportsCar = new Car("Red", 2, 20, 12);
        System.out.println("Sports Car Color: " + sportsCar.getColor() + ", Passengers: " + sportsCar.getNumberOfPassengers());

        SemiTruck bigRig = new SemiTruck("Blue", 2, 60000, 200);
        System.out.println("Custom Truck - Color: " + bigRig.getColor() + ", Cargo: " + bigRig.getCargoCapacity());

        Hovercraft seaRider = new Hovercraft("Orange", 10, 150, 30);
        System.out.println("Custom Hovercraft - Color: " + seaRider.getColor() + ", Passengers: " + seaRider.getNumberOfPassengers());

    }
}
