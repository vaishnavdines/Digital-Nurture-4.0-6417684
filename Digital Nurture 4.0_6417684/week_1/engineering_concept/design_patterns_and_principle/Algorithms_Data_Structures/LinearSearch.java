package week_1.engineering_concept.design_patterns_and_principle.Algorithms_Data_Structures;

public class LinearSearch implements SearchStrategy {
    @Override
    public Product search(Product[] products, String name) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}
