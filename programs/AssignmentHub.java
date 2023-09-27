package programs;

public class AssignmentHub {

    public static int add(int a, int b) {
        int res;
        res = a + b;
        return res;
    }

    public void printAdd() {
        add(6, 7);
    }

    public static void main(String[] args) {

        byte a = 10;
        byte b = 10;
        // byte c = a + b;// Compile Time Error: because a+b=20 will be int
        byte c = (byte) (a + b);
        System.out.println(c);

        Student student = new Student();
        student.age = 22;
        student.height = 5.8f;
        student.marks = 28;

        if (student.marks > 35) {
            System.out.println("Student passed");
        } else {
            System.out.println("Student failed");
        }
        System.out.println(add(5, 6));
    }
}

class Student {
    byte age;
    float height;
    int marks;
}