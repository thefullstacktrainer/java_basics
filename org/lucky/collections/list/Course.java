package org.lucky.collections.list;

public class Course {
    private String name;
    private int durationInHours;

    public Course(String name, int durationInHours) {
        this.name = name;
        this.durationInHours = durationInHours;
    }

    public String getName() {
        return name;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    @Override
    public String toString() {
        return "Course: " + name + " (Duration: " + durationInHours + " hours)";
    }
}

