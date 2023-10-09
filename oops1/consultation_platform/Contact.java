package oops1.consultation_platform;

import java.util.Map;

public class Contact {

    // Attributes
    private long contactId;
    private String email;
    private String phone;
    private String address;
    private Map<String, String> socialMediaLinks; // e.g., {"Facebook": "https://facebook.com/ourCompany"}
    private String operatingHours;

    // Constructor
    public Contact(long contactId, String email, String phone, String address,
            Map<String, String> socialMediaLinks, String operatingHours) {
        this.contactId = contactId;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.socialMediaLinks = socialMediaLinks;
        this.operatingHours = operatingHours;
    }

    // Getter methods
    public long getContactId() {
        return contactId;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Map<String, String> getSocialMediaLinks() {
        return socialMediaLinks;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    // Setter methods
    public void setContactId(long contactId) {
        this.contactId = contactId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSocialMediaLinks(Map<String, String> socialMediaLinks) {
        this.socialMediaLinks = socialMediaLinks;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    // Behavior
    public void displayContactInfo() {
        System.out.println("Contact ID: " + contactId);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Social Media Profiles: " + socialMediaLinks);
        System.out.println("Operating Hours: " + operatingHours);
    }

}
