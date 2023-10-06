package revision.basics;

import java.util.Date;

public class Student {
    int uid;
    String name;
    String[] courses;
    Date dob;
    String country;

    public Student(String name) {
        this.name = name;
        System.out.println("constructor with 1 params");
    }

    public Student(int uid) {
        this.uid = uid;
    }

    public Student(String name, int uid) {
        this(name);
        this.uid = uid;
        System.out.println("constructor with 2 params");
    }

    public Student(int uid, String name) {
        this.name = name;
        this.uid = uid;
    }

    public Student(String name, int uid, String[] courses) {
        this(name, uid);
        this.courses = courses;
        System.out.println("constructor with 3 params");
    }

    public Student(String name, int uid, String[] courses, Date dob) {
        this(name, uid, courses);
        this.name = name;
        System.out.println("constructor with 4 params");

    }

    public String[] getCourses() {
        return this.courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
