package week_1.engineering_concept.design_patterns_and_principle.Algorithms_Data_Structures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();

        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            
            ProductSearchService linearService = new ProductSearchService(new LinearSearch());
            Product found1 = linearService.search(repo.getAllProducts().toArray(Product[]::new), input);
            System.out.println("Linear Search Result: " + (found1 != null ? found1.getProductName()+" with ID "+found1.getProductId()+" in the category "+found1.getCategory() : "Not Found"));
            
            ProductSearchService binaryService = new ProductSearchService(new BinarySearch());
            Product found2 = binaryService.search(repo.getSortedProductsByName(), input);
            System.out.println("Binary Search Result: " + (found2 != null ? found2.getProductName()+" with ID "+found2.getProductId()+" in the category "+found2.getCategory() : "Not Found"));
        }
    }

}

