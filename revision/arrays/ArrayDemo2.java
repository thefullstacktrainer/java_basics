package revision.arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] articleTitles = {
                "The Rise of AI",
                "Climate Change and its Effects",
                "Modern Architecture: A Retrospective",
                "The Future of Renewable Energy"
        };

        for (String title : articleTitles) {
            System.out.println(title);
        }
        // getting the class name of Java array
        Class c = articleTitles.getClass();
        String name = c.getName();

        // printing the class name of Java array
        System.out.println(name);

        Article[] articles = {
                new Article("The Rise of Technology", "Arjun Patel", "The role of technology in modern India..."),
                new Article("Heritage of Rajasthan", "Priya Sharma", "Rajasthan, known for its rich history..."),
                new Article("Yoga and Meditation", "Rohan Verma", "The ancient practices of Yoga..."),
                new Article("Indian Culinary Arts", "Ananya Kapoor", "Indian cuisine is diverse and offers..."),
                new Article("The Bollywood Phenomenon", "Deepika Mehta",
                        "Bollywood has been the face of Indian cinema..."),
                new Article("Modern Literature", "Vikram Joshi",
                        "The contemporary writers shaping Indian literature..."),
                new Article("Renewable Energy in India", "Suresh Kumar",
                        "India is making strides in renewable energy..."),
                new Article("The Beauty of the Himalayas", "Ritu Singh",
                        "The majestic mountain ranges of the Himalayas..."),
                new Article("Traditional Indian Music", "Shreya Ghoshal",
                        "From classical ragas to contemporary fusion..."),
                new Article("Cricket: More Than Just a Sport", "Rahul Verma",
                        "Cricket has been an integral part of Indian culture...")
        };

        for (Article article : articles) {
            System.out.println(article);
        }

    }
}

class Article {
    private String title;
    private String author;
    private String content;

    public Article(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nContent: " + content + "\n------";
    }
}