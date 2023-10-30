package org.lucky.enums;

public class EnumDemo {
    public static void main(String[] args) {
        Day currentDay = Day.WEDNESDAY;
        System.out.println("Today is " + currentDay); // Output: Today is WEDNESDAY
        currentDay = Day.SUNDAY;
        switch (currentDay) {
            case SUNDAY:
                System.out.println("It's a weekend.");
                break;
            case MONDAY:
                System.out.println("It's a workday.");
                break;
            case TUESDAY:
                System.out.println("It's a workday.");
                break;
            case WEDNESDAY:
                System.out.println("It's a workday.");
                break;
            case THURSDAY:
                System.out.println("It's a workday.");
                break;
            case FRIDAY:
                System.out.println("It's almost the weekend!");
                break;
            case SATURDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's an unknown day.");
        }


        Color color = Color.RED;
        System.out.println("RGB value of RED: " + color.getRgbValue()); // Output: RGB value of RED: 255, 0, 0
        color = Color.GREEN;
        System.out.println("RGB value of GREEN: " + color.getRgbValue()); // Output: RGB value of GREEN: 0, 255, 0
        color = Color.BLUE;
        System.out.println("RGB value of BLUE: " + color.getRgbValue()); // Output: RGB value of BLUE: 0, 0, 255
    }
}


enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum Color {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255);

    private int red;
    private int green;
    private int blue;

    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getRgbValue() {
        return red + ", " + green + ", " + blue;
    }
}