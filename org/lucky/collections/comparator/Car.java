package org.lucky.collections.comparator;

public class Car {
    private String brand;
    private String model;
    private double rentalPrice;

    public Car(String brand, String model, double rentalPrice) {
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    @Override
    public String toString() {
        return brand + " " + model + " - Rental Price: $" + rentalPrice;
    }
}
