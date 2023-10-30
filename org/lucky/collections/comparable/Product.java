package org.lucky.collections.comparable;

public class Product implements Comparable<Product> {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their prices
        if (this.price < otherProduct.getPrice()) {
            return -1;
        } else if (this.price > otherProduct.getPrice()) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name + " - Rs " + price;
    }
}
