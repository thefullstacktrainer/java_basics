package org.lucky.enums;

public class TransportDemo {

    public enum TransportType {
        CAR("Four-wheeler"),
        BUS("Large vehicle for passengers"),
        BICYCLE("Two-wheeler");

        private final String description;

        TransportType(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    public static void main(String[] args) {
        TransportType myTransport = TransportType.BUS;

        switch (myTransport) {
            case CAR:
                System.out.println("I am driving a " + myTransport.getDescription());
                break;
            case BUS:
                System.out.println("I am taking a " + myTransport.getDescription());
                break;
            case BICYCLE:
                System.out.println("I am riding a " + myTransport.getDescription());
                break;
            default:
                System.out.println("I am traveling in an unknown mode of transport.");
        }
    }
}
