package org.lucky.collections.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Vendor {
    private String name;

    public Vendor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Product {
    private String name;
    private double price;
    private Vendor vendor;

    public Product(String name, double price, Vendor vendor) {
        this.name = name;
        this.price = price;
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Vendor getVendor() {
        return vendor;
    }
}

class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return Double.compare(product1.getPrice(), product2.getPrice());
    }
}

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void checkout() {
        System.out.println("Checking out the following items:");
        for (Product product : products) {
            System.out.println(product.getName() + " from " + product.getVendor().getName() + " - Rs" + product.getPrice());
        }
        System.out.println("Total Price: Rs" + getTotalPrice());
        System.out.println("Payment processed.");
    }
}

public class ECommerceExample {
    public static void main(String[] args) {
        Vendor vendor1 = new Vendor("Vendor A");
        Vendor vendor2 = new Vendor("Vendor B");

        Product product1 = new Product("Product 1", 2500.0, vendor1);
        Product product2 = new Product("Product 2", 3000.0, vendor1);
        Product product3 = new Product("Product 3", 2000.0, vendor2);

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        // Sort products by price using the comparator
        Collections.sort(products, new ProductPriceComparator());

        ShoppingCart cart = new ShoppingCart();
        for (Product product : products) {
            cart.addProduct(product);
        }

        cart.checkout();
    }
}
