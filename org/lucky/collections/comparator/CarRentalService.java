package org.lucky.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CarRentalService {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", 50.00));
        cars.add(new Car("Honda", "Civic", 45.00));
        cars.add(new Car("Ford", "Focus", 48.50));
        cars.add(new Car("Chevrolet", "Malibu", 55.00));

        System.out.println("Cars in the car rental service (unsorted):");
        for (Car car : cars) {
            System.out.println(car);
        }

        // Create a Comparator to compare cars based on rental price
        Comparator<Car> priceComparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return Double.compare(car1.getRentalPrice(), car2.getRentalPrice());
            }
        };

        // Sort the cars based on rental price using the Comparator
        Collections.sort(cars, priceComparator);

        System.out.println("\nCars in the car rental service (sorted by rental price):");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
