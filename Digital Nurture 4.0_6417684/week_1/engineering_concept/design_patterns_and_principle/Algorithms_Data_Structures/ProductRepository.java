package week_1.engineering_concept.design_patterns_and_principle.Algorithms_Data_Structures;

import java.util.*;

public class ProductRepository {
    private final List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        products.add(new Product(1, "Laptop", "Electronics"));
        products.add(new Product(2, "Shampoo", "Beauty"));
        products.add(new Product(3, "Phone", "Electronics"));
        products.add(new Product(4, "Table", "Furniture"));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product[] getSortedProductsByName() {
        return products.stream()
                       .sorted(Comparator.comparing(p -> p.getProductName().toLowerCase()))
                       .toArray(Product[]::new);
    }
}
