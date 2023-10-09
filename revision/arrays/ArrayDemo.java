package revision.arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] consultants = {
                "Arjun",
                "Priyanka",
                "Deepak",
                "Ananya",
                "Rahul",
                "Shreya",
                "Vikram",
                "Aishwarya",
                "Suresh",
                "Ritu"
        };

        for (String consultant : consultants) {
            System.out.println(consultant);
        }

        int[] numbers = { 1, 2, 3, 4, 5 };

        double[] decimals = { 1.1, 2.2, 3.3, 4.4 };

        char[] characters = { 'a', 'b', 'c', 'd' };

        boolean[] bools = { true, false, true };

        Person[] persons = new Person[5];

        // Multidimensional Arrays:
        // 2D Integer Array:

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // 3D Array:
        int[][][] threeDArray = {
                {
                        { 1, 2 },
                        { 3, 4 }
                },
                {
                        { 5, 6 },
                        { 7, 8 }
                }
        };

    }
}

class Person {
    String name;
}
