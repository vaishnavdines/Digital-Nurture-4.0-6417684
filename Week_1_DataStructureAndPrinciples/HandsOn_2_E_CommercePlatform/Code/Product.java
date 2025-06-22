package Week_1_DataStructureAndPrinciples.HandsOn_2_E_CommercePlatform.Code;

public class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void display() {
        System.out.println("[" + productId + "] " + productName + " - " + category);
    }
}
