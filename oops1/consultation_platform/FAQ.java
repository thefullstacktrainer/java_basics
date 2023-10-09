package oops1.consultation_platform;

public class FAQ {

    // Attributes
    private long faqId;
    private String question;
    private String answer;
    private String category;

    // Constructor
    public FAQ(long faqId, String question, String answer, String category) {
        this.faqId = faqId;
        this.question = question;
        this.answer = answer;
        this.category = category;
    }

    // Getter methods
    public long getFaqId() {
        return faqId;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public String getCategory() {
        return category;
    }

    // Setter methods
    public void setFaqId(long faqId) {
        this.faqId = faqId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Behavior
    public void displayFAQ() {
        System.out.println("FAQ ID: " + faqId);
        System.out.println("Category: " + category);
        System.out.println("Question: " + question);
        System.out.println("Answer: " + answer);
    }

}
