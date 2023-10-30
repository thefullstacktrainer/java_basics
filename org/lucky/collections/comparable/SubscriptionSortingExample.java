package org.lucky.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Subscription {
    private String name;
    private double price;
    private int durationInMonths;
    private String startDate;

    public Subscription(String name, double price, int durationInMonths, String startDate) {
        this.name = name;
        this.price = price;
        this.durationInMonths = durationInMonths;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public String getStartDate() {
        return startDate;
    }

    @Override
    public String toString() {
        return name + " - Rs " + price + " (" + durationInMonths + " months) - Start Date: " + startDate;
    }
}

class SubscriptionComparatorByPrice implements Comparator<Subscription> {
    @Override
    public int compare(Subscription sub1, Subscription sub2) {
        return Double.compare(sub1.getPrice(), sub2.getPrice());
    }
}

class SubscriptionComparatorByDuration implements Comparator<Subscription> {
    @Override
    public int compare(Subscription sub1, Subscription sub2) {
        return Integer.compare(sub1.getDurationInMonths(), sub2.getDurationInMonths());
    }
}

class SubscriptionComparatorByStartDate implements Comparator<Subscription> {
    @Override
    public int compare(Subscription sub1, Subscription sub2) {
        return sub1.getStartDate().compareTo(sub2.getStartDate());
    }
}

public class SubscriptionSortingExample {
    public static void main(String[] args) {
        List<Subscription> subscriptions = new ArrayList<>();
        subscriptions.add(new Subscription("Basic", 1000.99, 1, "2023-01-15"));
        subscriptions.add(new Subscription("Standard", 2400.99, 3, "2023-02-10"));
        subscriptions.add(new Subscription("Premium", 4900.99, 6, "2023-03-05"));

        // Sort subscriptions by price
        Collections.sort(subscriptions, new SubscriptionComparatorByPrice());
        System.out.println("Sorted by Price:");
        for (Subscription sub : subscriptions) {
            System.out.println(sub);
        }

        // Sort subscriptions by duration
        Collections.sort(subscriptions, new SubscriptionComparatorByDuration());
        System.out.println("\nSorted by Duration:");
        for (Subscription sub : subscriptions) {
            System.out.println(sub);
        }

        // Sort subscriptions by start date
        Collections.sort(subscriptions, new SubscriptionComparatorByStartDate());
        System.out.println("\nSorted by Start Date:");
        for (Subscription sub : subscriptions) {
            System.out.println(sub);
        }
    }
}
