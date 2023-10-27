package org.lucky.collections.set;
import java.util.Date;
public class Order {
    int orderId;
    Customer customer;
    Product product;
    int quantity;
    Date orderDate;

    public Order(int orderId, Customer customer, Product product, int quantity, Date orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }
}