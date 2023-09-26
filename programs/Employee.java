package programs;

public class Employee {
    Employee(String name) {
        this.name = name;
    }

    private double salary;

    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    public String name;

    public void setSalary(double empSal) {
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp() {
        System.out.println("name  : " + name);
        System.out.println("salary :" + salary);
    }

    public void printSalaryIncrement(int curSalary) {
        int increment = 10;
        int total = increment + curSalary;
        System.out.println("Total new salary is : " + total);
    }

    public static void main(String[] args) {
        Employee empOne = new Employee("Vikash");
        Employee empTwo = new Employee("Sumanth");
        empOne.setSalary(120000);
        empTwo.setSalary(200000);
        empOne.printEmp();
        empTwo.printEmp();
    }
}
