package com.mo.assetManager;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<Asset> assets = new ArrayList<>();


        assets.add(new House("My home", "2015-05-15", 250000,
                "123 Go Back To Africa St", 2, 2100, 6000));

        assets.add(new House("Beach house", "2018-03-20", 180000,
                "456 Kenya", 3, 1200, 3000));

        assets.add(new Vehicle("Mom's Car", "2019-07-10", 25000,
                "Honda Accord", 2018, 45000));

        assets.add(new Vehicle("Truck", "2015-11-05", 100000,
                "Ram 1500 TRX", 2024, 145000));

        for (Asset asset : assets) {
            System.out.println("\nDescription: " + asset.getDescription());
            System.out.println("Date acquired: " + asset.getDateAcquired());
            System.out.println("Original cost: $" + asset.getOriginalCost());
            System.out.println("Current value: $" + asset.getValue());

            if (asset instanceof House house) {
                System.out.println("Type: House");
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle vehicle) {
                System.out.println("Type: Vehicle");
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
            }
        }
    }
}

