package org.lucky.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

class OnlineBooking implements Comparable<OnlineBooking> {
    String name;
    int priority;

    public OnlineBooking(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(OnlineBooking other) {
        // Compare online bookings based on their priority (in reverse order for higher priority first)
        return Integer.compare(other.priority, this.priority);
    }
}

public class BookingQueue {
    public static void main(String[] args) {
        PriorityQueue<OnlineBooking> bookingQueue = new PriorityQueue<OnlineBooking>();

        // Simulate online bookings with priorities
        bookingQueue.add(new OnlineBooking("Flight Booking", 2));
        bookingQueue.add(new OnlineBooking("Hotel Booking", 1));
        bookingQueue.add(new OnlineBooking("Car Rental Booking", 3));
        bookingQueue.add(new OnlineBooking("Restaurant Reservation", 4));

        System.out.println("Online bookings based on their priority:");

        Iterator<OnlineBooking> iterator = bookingQueue.iterator();
        while (iterator.hasNext()) {
            OnlineBooking booking = iterator.next();
            System.out.println(booking.name + " - Priority: " + booking.priority);
        }

        // Remove the highest-priority booking from the queue
        bookingQueue.poll();

        System.out.println("\nAfter serving the highest-priority booking:");

        Iterator<OnlineBooking> iterator2 = bookingQueue.iterator();
        while (iterator2.hasNext()) {
            OnlineBooking booking = iterator2.next();
            System.out.println(booking.name + " - Priority: " + booking.priority);
        }
    }
}
