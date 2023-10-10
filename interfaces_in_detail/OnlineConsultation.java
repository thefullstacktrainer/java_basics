package interfaces_in_detail;

// Outer Interface
interface ConsultationPlatform {

    // Nested Interface
    interface FeedbackSystem {
        void leaveFeedback(String feedback);

        void displayFeedback();
    }

    // Nested Interface
    interface AppointmentSystem {
        void scheduleAppointment(String date);

        void displayAppointmentDetails();
    }

    void startConsultation();

    void endConsultation();
}

// Implementing the ConsultationPlatform and its nested interfaces
public class OnlineConsultation
        implements ConsultationPlatform, ConsultationPlatform.FeedbackSystem, ConsultationPlatform.AppointmentSystem {
    private String feedback;
    private String appointmentDate;

    @Override
    public void startConsultation() {
        System.out.println("Consultation started.");
    }

    @Override
    public void endConsultation() {
        System.out.println("Consultation ended.");
    }

    @Override
    public void leaveFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public void displayFeedback() {
        System.out.println("Feedback: " + feedback);
    }

    @Override
    public void scheduleAppointment(String date) {
        this.appointmentDate = date;
    }

    @Override
    public void displayAppointmentDetails() {
        System.out.println("Appointment scheduled on: " + appointmentDate);
    }

    public static void main(String[] args) {
        OnlineConsultation session = new OnlineConsultation();

        // Using methods from the ConsultationPlatform interface
        session.startConsultation();

        // Using methods from the FeedbackSystem nested interface
        session.leaveFeedback("Great session!");
        session.displayFeedback();

        // Using methods from the AppointmentSystem nested interface
        session.scheduleAppointment("2023-10-10");
        session.displayAppointmentDetails();

        session.endConsultation();
    }
}
