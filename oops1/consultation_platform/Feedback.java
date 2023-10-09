package oops1.consultation_platform;

import java.util.Date; // Required for the dateGiven attribute

public class Feedback {
    // Attributes
    private long feedbackId;
    private long consultantId; // Assuming the consultant's ID is also of type long
    private String comment;
    private float rating; // Assuming a rating like 4.5 out of 5
    private Date dateGiven;

    // Constructor
    public Feedback(long feedbackId, long consultantId, String comment, float rating, Date dateGiven) {
        this.feedbackId = feedbackId;
        this.consultantId = consultantId;
        this.comment = comment;
        this.rating = rating;
        this.dateGiven = dateGiven;
    }

    // Getter methods
    public long getFeedbackId() {
        return feedbackId;
    }

    public long getConsultantId() {
        return consultantId;
    }

    public String getComment() {
        return comment;
    }

    public float getRating() {
        return rating;
    }

    public Date getDateGiven() {
        return dateGiven;
    }

    // Behavior
    public void displayFeedbackInfo() {
        System.out.println("Feedback ID: " + feedbackId);
        System.out.println("For Consultant ID: " + consultantId);
        System.out.println("Rating: " + rating);
        System.out.println("Comment: " + comment);
        System.out.println("Date Given: " + dateGiven);
    }

}
