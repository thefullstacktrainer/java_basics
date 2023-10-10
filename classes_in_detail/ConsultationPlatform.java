package classes_in_detail;

abstract class Consultation {
    abstract void feedback();
}

interface ConsultationFeedback {
    void provideFeedback();
}

public class ConsultationPlatform {

    public static void main(String[] args) {

        // Creating an instance of Consultation using an anonymous inner class
        Consultation session = new Consultation() {
            @Override
            void feedback() {
                System.out.println("This was an excellent consultation session!");
            }
        };

        session.feedback();

        // Creating an instance of ConsultationFeedback using an anonymous inner class
        ConsultationFeedback feedback = new ConsultationFeedback() {
            @Override
            public void provideFeedback() {
                System.out.println("The consultation was very insightful and helpful!");
            }
        };

        feedback.provideFeedback();

        ConsultationPlatform platform = new ConsultationPlatform();
        platform.scheduleConsultation("Dr. Niranjan", 30);
    }

    public void scheduleConsultation(String consultantName, int durationMinutes) {

        // Local inner class
        class ScheduledConsultation {
            private String consultant;
            private int duration;

            ScheduledConsultation(String consultant, int duration) {
                this.consultant = consultant;
                this.duration = duration;
            }

            void displayDetails() {
                System.out.println("Consultation scheduled with " + consultant + " for " + duration + " minutes.");
            }
        }

        // Creating an instance of the local inner class
        ScheduledConsultation consultation = new ScheduledConsultation(consultantName, durationMinutes);
        consultation.displayDetails();
    }
}
