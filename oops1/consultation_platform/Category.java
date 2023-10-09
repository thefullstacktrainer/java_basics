package oops1.consultation_platform;

public class Category {

    // Attributes
    private long categoryId;
    private String categoryName;
    private String description;

    // Constructor
    public Category(long categoryId, String categoryName, String description) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
    }

    // Getter and Setter methods
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Behavior
    public void displayCategoryInfo() {
        System.out.println("Category ID: " + categoryId);
        System.out.println("Category Name: " + categoryName);
        System.out.println("Description: " + description);
    }
}
