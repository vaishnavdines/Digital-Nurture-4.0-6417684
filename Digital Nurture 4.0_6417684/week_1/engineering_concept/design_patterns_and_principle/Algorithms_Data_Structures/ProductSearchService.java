package week_1.engineering_concept.design_patterns_and_principle.Algorithms_Data_Structures;

public class ProductSearchService {
    private final SearchStrategy strategy;

    public ProductSearchService(SearchStrategy strategy) {
        this.strategy = strategy;
    }

    public Product search(Product[] products, String name) {
        return strategy.search(products, name);
    }
}

