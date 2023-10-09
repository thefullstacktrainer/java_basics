package oops1.consultation_platform;

import java.util.Date;

public abstract class AbstractContent {
    protected long id;
    protected String title;
    protected Date dateCreated;

    // Constructor
    public AbstractContent(long id, String title, Date dateCreated) {
        this.id = id;
        this.title = title;
        this.dateCreated = dateCreated;
    }

    // Abstract method to be implemented by subclasses
    public abstract void displayContent();

    // Common methods (Getters and Setters)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}