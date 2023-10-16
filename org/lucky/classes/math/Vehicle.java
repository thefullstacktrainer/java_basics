package org.lucky.classes.math;

public class Vehicle {
    private String name;
    private double speed; // Speed in kilometers per hour
    private double distanceTraveled; // Distance traveled in kilometers

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
        this.distanceTraveled = 0;
    }

    public void drive(double hours) {
        double distance = speed * hours;
        distanceTraveled += distance;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public void displayInfo() {
        System.out.println("Vehicle: " + name);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Distance Traveled: " + distanceTraveled + " km");
    }

    // Calculate and return the square root of the distance traveled
    public double calculateSquareRootOfDistance() {
        return Math.sqrt(distanceTraveled);
    }

    // Calculate and return the sine of the speed
    public double calculateSineOfSpeed() {
        return Math.sin(Math.toRadians(speed));
    }

    // Calculate and return the cosine of the speed
    public double calculateCosineOfSpeed() {
        return Math.cos(Math.toRadians(speed));
    }

    // Calculate and return the tangent of the speed
    public double calculateTangentOfSpeed() {
        return Math.tan(Math.toRadians(speed));
    }

    // Calculate and return the absolute value of the speed
    public double calculateAbsoluteSpeed() {
        return Math.abs(speed);
    }

    // Round the speed to the nearest integer
    public long roundSpeed() {
        return Math.round(speed);
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car", 100.0);

        car.drive(2.5); // Drive for 2.5 hours
        car.displayInfo();

        // Using Math methods
        System.out.println("Square root of distance traveled: " + car.calculateSquareRootOfDistance());
        System.out.println("Sine of speed: " + car.calculateSineOfSpeed());
        System.out.println("Cosine of speed: " + car.calculateCosineOfSpeed());
        System.out.println("Tangent of speed: " + car.calculateTangentOfSpeed());
        System.out.println("Absolute speed: " + car.calculateAbsoluteSpeed());
        System.out.println("Rounded speed: " + car.roundSpeed());
    }
}
