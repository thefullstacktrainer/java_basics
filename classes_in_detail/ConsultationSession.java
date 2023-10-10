package classes_in_detail;

public class ConsultationSession {

    // Outer class variable
    private String consultantName;

    public ConsultationSession(String consultantName) {
        this.consultantName = consultantName;
    }

    // Member Inner Class
    public class Feedback {
        private String feedbackMessage;

        public Feedback(String feedbackMessage) {
            this.feedbackMessage = feedbackMessage;
        }

        public void displayFeedback() {
            // Note: The inner class can access private members of the outer class
            System.out.println("Feedback for " + consultantName + ": " + feedbackMessage);
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class
        ConsultationSession session = new ConsultationSession("Dr. Smitha");

        // Create an instance of the inner class
        ConsultationSession.Feedback feedback = session.new Feedback("Great consultation, very helpful!");

        // Display the feedback
        feedback.displayFeedback();
    }
}
