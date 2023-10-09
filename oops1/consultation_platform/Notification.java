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
        this.isRead = false;
    }

    // Getter methods
    public long getNotificationId() {
        return notificationId;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public boolean isRead() {
        return isRead;
    }

    // Setter methods
    public void setNotificationId(long notificationId) {
        this.notificationId = notificationId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    // Utility methods
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

    // Control flow methods
    public void displayIfUrgent() {
        if (!this.isRead && this.notificationType == NotificationType.ALERT) {
            System.out.println("URGENT: " + this.getTitle());
        }
    }

    public boolean requiresImmediateAttention() {
        return !this.isRead && (this.notificationType == NotificationType.ALERT
                || this.notificationType == NotificationType.REMINDER);
    }

    // Enum for notification type
    public enum NotificationType {
        NEWS, ALERT, UPDATE, REMINDER, OTHER;
    }

}
