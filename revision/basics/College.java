package revision.basics;

public class College {
    static public String collegeName = "IISC";
    int totalDepartments;
    int totalStaff;
    String principal;

    public College() {
        System.out.println("College default constructor called");
    }

    public College(String principal) {
        this.principal = principal;
    }

}
