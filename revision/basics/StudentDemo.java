package revision.basics;

import java.util.Date;

public class StudentDemo {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Student s1 = new Student("Manoj");
        Student s2 = new Student("Rakshit", 12);
        String courses[] = { "Java", "ReactJS", "JS" };
        s1.setCourses(courses);
        students[0] = s1;
        students[1] = s2;
        Student s3 = new Student("Sumanth", 12, new String[] { "Java" }, new Date(1998, 11, 2));
        students[5] = s3;
        for (Student s : students) {
            if (s != null) {
                System.out.println(s.name);
                String[] stCourses = s.getCourses();
                if (stCourses != null) {
                    for (String course : stCourses)
                        System.out.println(course);
                }
            }
        }
    }
}
