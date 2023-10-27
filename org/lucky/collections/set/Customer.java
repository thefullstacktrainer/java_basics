package org.lucky.collections.set;

import java.util.TreeSet;
public class Customer {
    int customerId;
    String name;
    TreeSet<Order> orders;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new TreeSet<Order>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }
}