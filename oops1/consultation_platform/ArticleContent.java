package oops1.consultation_platform;

import java.util.Date;

class ArticleContent extends AbstractContent {
    private String articleText;

    public ArticleContent(long id, String title, Date dateCreated, String articleText) {
        super(id, title, dateCreated);
        this.articleText = articleText;
    }

    @Override
    public void displayContent() {
        System.out.println("Article Title: " + title);
        System.out.println("Content: " + articleText);
        System.out.println("Date Published: " + dateCreated);
    }
}