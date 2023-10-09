package oops1.consultation_platform;

import java.util.Date;

// Concrete class extending AbstractContent: Notification
class Notification extends AbstractContent {
    private String message;
    private NotificationType notificationType;
    private boolean isRead;

    public Notification(long notificationId, String title, Date dateCreated,
            String message, NotificationType notificationType) {
        super(notificationId, title, dateCreated);
        this.message = message;
        this.notificationType = notificationType;
        this.isRead = false;
    }

    @Override
    public void displayContent() {
        System.out.println("Notification Title: " + title);
        System.out.println("Type: " + notificationType);
        System.out.println("Message: " + message);
        System.out.println("Date: " + dateCreated);
        System.out.println("Read Status: " + (isRead ? "Read" : "Unread"));
    }

    // Getter methods

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
        System.out.println("Notification ID: " + id);
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
