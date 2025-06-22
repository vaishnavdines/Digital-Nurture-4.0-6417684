package Week_1_DataStructureAndPrinciples.HandsOn_2_E_CommercePlatform.Code;

import java.util.Arrays;
import java.util.Comparator;

public class SearchUtil {

    public static void linearSearch(String name, Product[] products) {
        boolean found = false;
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(name)) {
                System.out.println("Product found (Linear):");
                p.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No product named '" + name + "' found (Linear).");
        }
    }

    public static void binarySearch(String name, Product[] products) {
        Product[] sorted = products.clone();
        Arrays.sort(sorted, Comparator.comparing(p -> p.getProductName().toLowerCase()));

        int left = 0, right = sorted.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            String midName = sorted[mid].getProductName();

            int result = name.compareToIgnoreCase(midName);
            if (result == 0) {
                System.out.println("Product found (Binary):");
                sorted[mid].display();
                return;
            } else if (result > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("No product named '" + name + "' found (Binary).");
    }
}
