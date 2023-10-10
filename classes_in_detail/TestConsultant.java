package classes_in_detail;

public class TestConsultant {

    public static void main(String args[]) {
        Consultant consultant;

        // ITConsultant
        consultant = new ITConsultant("Arjun", 5);
        System.out.println(consultant.getName() + " is an IT Consultant with " + consultant.getExperience()
                + " years of experience. Hourly rate: $" + consultant.getHourlyRate());
        System.out.println("Consultation cost for 4 hours: $" + consultant.calculateCost(4));
        System.out.println();

        // BusinessConsultant
        consultant = new BusinessConsultant("Priya", 8);
        System.out.println(consultant.getName() + " is a Business Consultant with " + consultant.getExperience()
                + " years of experience. Hourly rate: $" + consultant.getHourlyRate());
        System.out.println("Consultation cost for 4 hours: $" + consultant.calculateCost(4));
    }
}

abstract class Consultant {
    private String name;
    private int experienceYears; // Number of years of experience

    // Constructor
    public Consultant(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    // Abstract method to get the hourly rate of a consultant
    abstract int getHourlyRate();

    // Method to get the name of the consultant
    public String getName() {
        return name;
    }

    // Method to get the experience of the consultant
    public int getExperience() {
        return experienceYears;
    }

    // Method to calculate consultation cost for a given number of hours
    public int calculateCost(int hours) {
        return hours * getHourlyRate();
    }
}

class ITConsultant extends Consultant {
    // Constructor
    public ITConsultant(String name, int experienceYears) {
        super(name, experienceYears);
    }

    // IT consultants charge $100 per hour
    int getHourlyRate() {
        return 100;
    }
}

class BusinessConsultant extends Consultant {
    // Constructor
    public BusinessConsultant(String name, int experienceYears) {
        super(name, experienceYears);
    }

    // Business consultants charge $150 per hour
    int getHourlyRate() {
        return 150;
    }
}