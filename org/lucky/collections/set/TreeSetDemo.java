package org.lucky.collections.set;
import java.util.Date;
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<Product>((p1, p2) -> Integer.compare(p1.productId, p2.productId));
        TreeSet<Customer> customers = new TreeSet<Customer>((c1, c2) -> Integer.compare(c1.customerId, c2.customerId));

        // Creating Products
        Product product1 = new Product(101, "Laptop", 899.99);
        Product product2 = new Product(102, "Smartphone", 499.99);
        Product product3 = new Product(103, "Headphones", 49.99);

        // Adding Products to TreeSet
        products.add(product1);
        products.add(product2);
        products.add(product3);

        // Creating Customers
        Customer customer1 = new Customer(201, "John");
        Customer customer2 = new Customer(202, "Mary");

        // Creating Orders
        Order order1 = new Order(301, customer1, product1, 2, new Date());
        Order order2 = new Order(302, customer2, product2, 1, new Date());
        Order order3 = new Order(303, customer1, product3, 3, new Date());

        // Adding Customers to TreeSet
        customers.add(customer1);
        customers.add(customer2);

        // Traversing Products
        System.out.println("List of Products (sorted by ID):");
        for (Product product : products) {
            System.out.println(product.productId + " " + product.name + " $" + product.price);
        }

        // Traversing Customers
        System.out.println("\nList of Customers (sorted by ID):");
        for (Customer customer : customers) {
            System.out.println("Customer ID: " + customer.customerId + " Name: " + customer.name);
        }
    }
}