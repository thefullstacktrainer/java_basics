package org.lucky.classes.math;

public class MathOperationsExample {
    public static void main(String[] args) {
        // Minimum and Maximum
        int minNumber = Math.min(5, 8);
        int maxNumber = Math.max(12, 7);
        System.out.println("Minimum: " + minNumber);
        System.out.println("Maximum: " + maxNumber);

        // Average
        double average = Math.ceil((minNumber + maxNumber) / 2.0);
        System.out.println("Average: " + average);

        // Trigonometric Functions (in radians)
        double angleInRadians = Math.toRadians(45); // Convert to radians
        double sinValue = Math.sin(angleInRadians);
        double cosValue = Math.cos(angleInRadians);
        double tanValue = Math.tan(angleInRadians);
        System.out.println("Sine: " + sinValue);
        System.out.println("Cosine: " + cosValue);
        System.out.println("Tangent: " + tanValue);

        // Rounding
        double valueToRound = 7.65;
        long roundedValue = Math.round(valueToRound);
        double ceilValue = Math.ceil(valueToRound);
        double floorValue = Math.floor(valueToRound);
        System.out.println("Rounded Value: " + roundedValue);
        System.out.println("Ceil Value: " + ceilValue);
        System.out.println("Floor Value: " + floorValue);

        // Handling Overflow
        int maxInt = Integer.MAX_VALUE;
        try {
            int overflowedValue = Math.addExact(maxInt, 1); // Throws ArithmeticException
            System.out.println("Overflowed Value: " + overflowedValue);
        } catch (ArithmeticException e) {
            System.out.println("Overflow occurred: " + e.getMessage());
        }
    }
}
