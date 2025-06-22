package Week_1_DataStructureAndPrinciples.HandsOn_2_E_CommercePlatform.Code;

import java.util.Scanner;
public class MainSearchApp {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "iPhone 14", "Electronics"),
            new Product(2, "T-Shirt", "Clothing"),
            new Product(3, "MacBook Air", "Electronics"),
            new Product(4, "Shoes", "Footwear"),
            new Product(5, "Washing Machine", "Home Appliances"),
            new Product(6, "Rice", "Grocery"),
            new Product(7, "Sugar", "Grocery")
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose search type: linear / binary");
        String type = sc.nextLine().trim();

        System.out.print("Enter product name to search: ");
        String keyword = sc.nextLine().trim();

        if (type.equalsIgnoreCase("linear")) {
            SearchUtil.linearSearch(keyword, products);
        } else if (type.equalsIgnoreCase("binary")) {
            SearchUtil.binarySearch(keyword, products);
        } else {
            System.out.println("Invalid search type.");
        }

        sc.close();
    }
}
