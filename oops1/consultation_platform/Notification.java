package oops1.consultation_platform;

import java.util.Date;

public class Notification {

    // Attributes
    private long notificationId;
    private String title;
    private String message;
    private NotificationType notificationType;
    private Date dateCreated;
    private boolean isRead;

    // Constructor
    public Notification(long notificationId, String title, String message,
            NotificationType notificationType, Date dateCreated) {
        this.notificationId = notificationId;
        this.title = title;
        this.message = message;
        this.notificationType = notificationType;
        this.dateCreated = dateCreated;
        this.isRead = false; // Default to false when a notification is created
    }

    // Getter and Setter methods
    // ... (similar to the previous examples)

    // Additional behaviors or methods
    public void markAsRead() {
        this.isRead = true;
    }

    public void displayNotification() {
        System.out.println("Notification ID: " + notificationId);
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
        System.out.println("Type: " + notificationType);
        System.out.println("Date: " + dateCreated);
        System.out.println("Read: " + (isRead ? "Yes" : "No"));
    }

    // Enum for notification type
    public enum NotificationType {
        NEWS, ALERT, UPDATE, REMINDER, OTHER;
    }

}
