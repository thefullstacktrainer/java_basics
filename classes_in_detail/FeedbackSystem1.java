package classes_in_detail;

interface Writable {
    void write(String feedback);
}

interface Displayable {
    void display();
}

public class FeedbackSystem1 implements Writable, Displayable {
    private String feedback;

    @Override
    public void write(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public void display() {
        System.out.println("Feedback: " + feedback);
    }

    public static void main(String args[]) {
        FeedbackSystem1 feedback = new FeedbackSystem1();
        feedback.write("Great consultation!");
        feedback.display();
    }
}