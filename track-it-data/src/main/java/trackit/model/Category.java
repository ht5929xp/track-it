package trackit.model;

public class Category extends BaseEntity {
    private String categoryName;
    private String categoryDesc;

    public Category(String categoryName, String categoryDesc) {
        this.categoryName = categoryName;
        this.categoryDesc = categoryDesc;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", categoryDesc='" + categoryDesc + '\'' +
                '}';
    }
}
