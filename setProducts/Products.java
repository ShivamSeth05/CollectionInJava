package setProducts;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Products {

    public static void main(String[] args) {
        Set<String> products = new HashSet<>();
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

        // Adding products to the set
        System.out.println("Enter the name of the products you want to add:");
        while (sc.hasNextLine()) {
            String product = sc.nextLine();
            if (product.equals("")) {
                break;
            }
            products.add(product);
        }

        System.out.println("Current products in the set: " + products);

        // Removing a product from the set
        System.out.println("Enter the name of the product you want to remove:");
        String productToRemove = sc.nextLine();
        products.remove(productToRemove);
        System.out.println("Current products in the set: " + products);

        // Union
        Set<String> newProducts = new HashSet<>();
        newProducts.add("Laptop");
        newProducts.add("Tablet");
        newProducts.add("Smartphone");
        newProducts.add("Television");
        Set<String> union = new HashSet<>(products);
        union.addAll(newProducts);
        System.out.println("Union of products: " + union);

        // Intersection
        Set<String> intersection = new HashSet<>(products);
        intersection.retainAll(newProducts);
        System.out.println("Intersection of products: " + intersection);

        // Difference
        Set<String> difference = new HashSet<>(products);
        difference.removeAll(newProducts);
        System.out.println("Difference of products: " + difference);
    }
}
