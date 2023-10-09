package oops1.consultation_platform;

import java.util.Date;

public class Content {

    // Attributes
    private long contentId;
    private long consultantId;
    private String title;
    private String description;
    private ContentType contentType; // Enum for type of content
    private Date uploadDate;
    private String url;
    private String tags; // Comma-separated list of tags or topics

    // Constructor
    public Content(long contentId, long consultantId, String title, String description,
            ContentType contentType, Date uploadDate, String url, String tags) {
        this.contentId = contentId;
        this.consultantId = consultantId;
        this.title = title;
        this.description = description;
        this.contentType = contentType;
        this.uploadDate = uploadDate;
        this.url = url;
        this.tags = tags;
    }

    // Getter and Setter methods
    public long getContentId() {
        return contentId;
    }

    public void setContentId(long contentId) {
        this.contentId = contentId;
    }

    public long getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(long consultantId) {
        this.consultantId = consultantId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public void displayIfVideoContent() {
        if (this.contentType == ContentType.VIDEO) {
            this.displayContentInfo();
        }
    }

    // Behavior
    public void displayContentInfo() {
        System.out.println("Content ID: " + contentId);
        System.out.println("By Consultant ID: " + consultantId);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Type: " + contentType);
        System.out.println("Uploaded On: " + uploadDate);
        System.out.println("Access here: " + url);
        System.out.println("Tags: " + tags);
    }

    // Enum for content type
    public enum ContentType {
        ARTICLE, VIDEO, PODCAST, WEBINAR, EBOOK, OTHER;
    }

}
