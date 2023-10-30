package org.lucky.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperStore {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop", 99999.00));
        productList.add(new Product("Smartphone", 59999.00));
        productList.add(new Product("Tablet", 29999.00));
        productList.add(new Product("Headphones", 9999.00));

        // Sort the products based on price using the Comparable interface
        Collections.sort(productList);

        // Print the sorted products
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
