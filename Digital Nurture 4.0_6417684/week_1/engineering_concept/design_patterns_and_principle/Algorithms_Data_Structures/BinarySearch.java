package week_1.engineering_concept.design_patterns_and_principle.Algorithms_Data_Structures;

public class BinarySearch implements SearchStrategy {
    @Override
    public Product search(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}
