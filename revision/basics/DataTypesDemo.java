package revision.basics;

public class DataTypesDemo {

    static String university = "VTU";
    String college = "BMS";
    int branches = 4;

    public static void main(String[] args) {
        DataTypesDemo d1 = new DataTypesDemo();
        System.out.println(d1.college);
        System.out.println(d1.branches);
        System.out.println(d1.university); // Better to access using Class name as this is static
        System.out.println(DataTypesDemo.university);
        DataTypesDemo d2 = new DataTypesDemo();
        System.out.println(d2.college);
        System.out.println(d2.branches);
    }
}