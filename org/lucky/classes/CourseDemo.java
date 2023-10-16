package org.lucky.classes;

public class CourseDemo implements Course {
    /**
     *
     */
    @Override
    public void showCourse() {
System.out.println("showCourse");
    }

    /**
     *
     */
    @Override
    public void showCourses() {
        System.out.println("showCourses");
    }

    public static void main(String[] args) {
        CourseDemo cd = new CourseDemo();
        cd.showCourse();
    }
}


