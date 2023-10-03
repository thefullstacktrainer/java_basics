package oops;

// Abstract class for Notifications and Communication
abstract class Notifications {
    // Abstract method to send push notifications
    abstract void sendPushNotification(User user, String message);

    // Abstract method to send email notifications
    abstract void sendEmailNotification(User user, String subject, String message);

    // Abstract method to send in-app messages
    abstract void sendInAppMessage(User user, String message);
}

// Concrete subclass implementing the Notifications abstract class
class ConcreteNotifications extends Notifications {
    @Override
    void sendPushNotification(User user, String message) {
        // Implementation for sending push notification
        System.out.println("Sending push notification to " + user.getUsername() + ": " + message);
    }

    @Override
    void sendEmailNotification(User user, String subject, String message) {
        // Implementation for sending email notification
        System.out.println(
                "Sending email notification to " + user.getUsername() + " with subject '" + subject + "': " + message);
    }

    @Override
    void sendInAppMessage(User user, String message) {
        // Implementation for sending in-app message
        System.out.println("Sending in-app message to " + user.getUsername() + ": " + message);
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

public class AbstractClassExample {
    public static void main(String[] args) {
        // Create an instance of the ConcreteNotifications class
        ConcreteNotifications notificationService = new ConcreteNotifications();

        // Create a user
        User user = new User("exampleUser");

        // Send notifications using the ConcreteNotifications instance
        notificationService.sendPushNotification(user, "New game update available!");
        notificationService.sendEmailNotification(user, "Important Announcement", "Check out our latest tournament!");
        notificationService.sendInAppMessage(user, "You have a new friend request.");
    }
}
