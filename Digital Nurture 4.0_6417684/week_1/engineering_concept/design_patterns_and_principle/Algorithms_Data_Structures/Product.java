package week_1.engineering_concept.design_patterns_and_principle.Algorithms_Data_Structures;
public class Product {
    private final int productId;
    private final String productName;
    private final String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public int getProductId() {
        return productId;
    }
}
