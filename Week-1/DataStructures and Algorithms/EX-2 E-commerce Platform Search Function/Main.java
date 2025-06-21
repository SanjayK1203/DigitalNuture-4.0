import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product[] arr = {
            new Product("1", "iPhone 16", "Mobile"),
            new Product("2", "MacBook Air M4", "Laptop"),
            new Product("3", "Samsung Galaxy S25", "Mobile"),
            new Product("4", "Sony Headphones", "Audio"),
            new Product("5", "Dell XPS", "Laptop")
        };

        // Sort the array for binary search
        Arrays.sort(arr);

        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("\nE-commerce Search System");
            System.out.println("1. Linear Search by Product Name");
            System.out.println("2. Binary Search by Product ID");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the product name: ");
                    String name = sc.nextLine();
                    Product found = SearchEngine.linearSearch(arr, name);

                    if (found != null) {
                        System.out.println("Product found: " + found);
                    } else {
                        System.out.println("No product found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the product ID: ");
                    String id = sc.nextLine().toUpperCase();
                    Product foundid = SearchEngine.binarySearch(arr, id);

                    if (foundid != null) {
                        System.out.println("Product found: " + foundid);
                    } else {
                        System.out.println("No product found.");
                    }
                    break;

                case 3:
                    run = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}