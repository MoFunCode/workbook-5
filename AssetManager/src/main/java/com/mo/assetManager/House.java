package com.mo.assetManager;

public class House extends Asset {

    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double pricePerSqrFt = switch(condition) {
            case 1 -> 180.00;
            case 2 -> 190.00;
            case 3 -> 90.00;
            case 4 -> 80.00;
            default -> {
                System.out.println("Ayooooo that an Invalid condition " + condition + ". Defaulting to poor rate.");
                yield 80.00;
            }
        };

        double baseValue = pricePerSqrFt * squareFoot;
        double lotValue = 0.25 * lotSize;
        return baseValue + lotValue;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }


}
