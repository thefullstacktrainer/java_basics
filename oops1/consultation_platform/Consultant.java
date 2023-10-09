package oops1.consultation_platform;

public class Consultant {
    // Attributes (Fields)
    private int id; // assuming a numeric identifier
    private String name;
    private String expertise;
    private String location;
    private double rating; // assuming rating is a decimal like 4.5 out of 5
    private String contactInfo;
    private boolean isActive; // a new attribute to check if a consultant is active

    // Constructor
    public Consultant(int id, String name, String expertise, String location, double rating, String contactInfo,
            boolean isActive) {
        this.id = id;
        this.name = name;
        this.expertise = expertise;
        this.location = location;
        this.rating = rating;
        this.contactInfo = contactInfo;
        this.isActive = isActive;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getExpertise() {
        return expertise;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public boolean isActive() {
        return isActive;
    }

    // Behavior (Methods)
    public void displayConsultantInfo() {
        System.out.println("Consultant ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Expertise: " + expertise);
        System.out.println("Location: " + location);
        System.out.println("Rating: " + rating);
        System.out.println("Contact: " + contactInfo);
        System.out.println("Is Active: " + isActive);
    }
}
