package oops1.consultation_platform;

import java.util.Date;

public class About {

    // Attributes
    private long aboutId;
    private String title;
    private String description;
    private String mission;
    private String vision;
    private String history;
    private Date dateUpdated;

    // Constructor
    public About(long aboutId, String title, String description, String mission,
            String vision, String history, Date dateUpdated) {
        this.aboutId = aboutId;
        this.title = title;
        this.description = description;
        this.mission = mission;
        this.vision = vision;
        this.history = history;
        this.dateUpdated = dateUpdated;
    }

    // Getter methods
    public long getAboutId() {
        return aboutId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getMission() {
        return mission;
    }

    public String getVision() {
        return vision;
    }

    public String getHistory() {
        return history;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    // Setter methods
    public void setAboutId(long aboutId) {
        this.aboutId = aboutId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    // Behavior
    public void displayAboutInfo() {
        System.out.println("About ID: " + aboutId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Mission: " + mission);
        System.out.println("Vision: " + vision);
        System.out.println("History: " + history);
        System.out.println("Last Updated: " + dateUpdated);
    }

}
