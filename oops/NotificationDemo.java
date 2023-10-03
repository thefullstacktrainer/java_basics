package oops;

// Abstract class for Notifications and Communication
abstract class Notifications {
    abstract void sendPushNotification(User user, String message);

    abstract void sendEmailNotification(User user, String subject, String message);

    abstract void sendInAppMessage(User user, String message);
}

// Concrete class for Push Notification
class PushNotification {
    private String message;

    public PushNotification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

// Concrete class for Email Notification
class EmailNotification {
    private String subject;
    private String message;

    public EmailNotification(String subject, String message) {
        this.subject = subject;
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

// Concrete class for In-App Message
class InAppMessage {
    private String message;

    public InAppMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

// Demo class to demonstrate the usage of the notification classes
public class NotificationDemo {
    public static void main(String[] args) {
        // Create a user for the demo
        User user = new User("exampleUser");

        // Create and send a push notification
        PushNotification pushNotification = new PushNotification("New game update available!");
        sendNotification(user, pushNotification);

        // Create and send an email notification
        EmailNotification emailNotification = new EmailNotification("Important Announcement",
                "Check out our latest tournament!");
        sendNotification(user, emailNotification);

        // Create and send an in-app message
        InAppMessage inAppMessage = new InAppMessage("You have a new friend request.");
        sendNotification(user, inAppMessage);
    }

    // Generic method to send notifications
    public static void sendNotification(User user, PushNotification notification) {
        // In a real application, you would implement the logic to send the push
        // notification to the user here
        System.out.println("Sending Push Notification to user: " + user.getUsername() + " - Message: "
                + notification.getMessage());
    }

    // Overloaded method to send email notifications
    public static void sendNotification(User user, EmailNotification notification) {
        // In a real application, you would implement the logic to send the email
        // notification to the user here
        System.out.println("Sending Email Notification to user: " + user.getUsername() + " - Subject: "
                + notification.getSubject() + ", Message: " + notification.getMessage());
    }

    // Overloaded method to send in-app messages
    public static void sendNotification(User user, InAppMessage notification) {
        // In a real application, you would implement the logic to send the in-app
        // message to the user here
        System.out.println(
                "Sending In-App Message to user: " + user.getUsername() + " - Message: " + notification.getMessage());
    }
}

// User class for reference
class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
