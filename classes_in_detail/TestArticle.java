package classes_in_detail;

public class TestArticle {
    public static void main(String args[]) {
        Article article = new DetailedArticle();
        article.title();
        article.author();
        article.content();
        article.summary();
    }
}

// Interface representing operations on an article
interface Article {
    void title();

    void author();

    void content();

    void summary();
}

// Abstract class implementing some of the methods from the Article interface
abstract class BasicArticle implements Article {
    public void title() {
        System.out.println("Article Title");
    }
}

// Concrete class providing implementations for the rest of the methods
class DetailedArticle extends BasicArticle {
    public void author() {
        System.out.println("Author: Ravi");
    }

    public void content() {
        System.out.println("This is the main content of the article...");
    }

    public void summary() {
        System.out.println("Summary: This article discusses the importance of consultations.");
    }
}
