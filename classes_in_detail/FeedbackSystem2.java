package classes_in_detail;

interface Writable {
    void write(String feedback);
}

interface DisplayableWithRating extends Writable {
    void display();

    void setRating(int rating);
}

public class FeedbackSystem2 implements DisplayableWithRating {
    private String feedback;
    private int rating;

    @Override
    public void write(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public void display() {
        System.out.println("Feedback: " + feedback + ". Rating: " + rating + "/5");
    }

    @Override
    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Invalid rating. Please provide a rating between 1 and 5.");
        }
    }

    public static void main(String args[]) {
        FeedbackSystem2 feedback = new FeedbackSystem2();
        feedback.write("Amazing session, highly informative.");
        feedback.setRating(5);
        feedback.display();
    }
}
