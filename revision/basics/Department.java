package revision.basics;

public class Department extends College {

    public Department() {

    }

    public Department(String principal) {
        super(principal);
    }

    public static void main(String[] args) {
        Department d = new Department();
        Department d2 = new Department("Manoj");
    }
}
