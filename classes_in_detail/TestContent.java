package classes_in_detail;

public class TestContent {
    public static void main(String args[]) {
        Article article = new Article("Introduction to Java", "Java is a popular programming language...");
        Video video = new Video("Java Tutorial", "https://www.example.com/java-tutorial");
        Podcast podcast = new Podcast("TechTalk with Raj", "Raj Sharma");

        ContentUtil.displayContent(article);
        ContentUtil.displayContent(video);
        ContentUtil.displayContent(podcast);
    }
}

class ContentUtil {
    public static void displayContent(Content content) {
        content.display();
        System.out.println("-------------");
    }
}

class Podcast extends AbstractContent {
    private String hostName;

    public Podcast(String title, String hostName) {
        super(title);
        this.hostName = hostName;
    }

    @Override
    public void display() {
        System.out.println("Listening to Podcast: " + getTitle());
        System.out.println("Hosted by: " + hostName);
    }
}

class Video extends AbstractContent {
    private String url;

    public Video(String title, String url) {
        super(title);
        this.url = url;
    }

    @Override
    public void display() {
        System.out.println("Playing Video: " + getTitle());
        System.out.println("URL: " + url);
    }
}

class Article extends AbstractContent {
    private String body;

    public Article(String title, String body) {
        super(title);
        this.body = body;
    }

    @Override
    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Body: " + body);
    }
}

abstract class AbstractContent implements Content {
    protected String title;

    public AbstractContent(String title) {
        this.title = title;
    }

    @Override
    public abstract void display();

    public String getTitle() {
        return title;
    }
}

interface Content {
    void display();
}
