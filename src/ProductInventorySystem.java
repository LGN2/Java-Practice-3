import java.util.ArrayList;
import java.util.Scanner;

public class ProductInventorySystem {
    public static void main(String[] args) {
        // Create scanner
        Scanner input = new Scanner(System.in);

        // Declare variables
        ArrayList<String> productNames;
        ArrayList<Double> productPrices;
        ArrayList<Integer> productQuantities;

        Double totalInventoryValue;
        Integer[] stockCounts;
        String mostExpensiveProduct;

        // Create lists
        productNames = new ArrayList<>();
        productPrices = new ArrayList<>();
        productQuantities = new ArrayList<>();

        // Enter information for 10 products
        for (Integer i = 0; i < 10; i++) {

            System.out.println("\nEnter Product " + (i + 1));

            System.out.print("Product Name: ");
            productNames.add(input.nextLine());

            System.out.print("Product Price: ");
            productPrices.add(input.nextDouble());

            System.out.print("Product Quantity: ");
            productQuantities.add(input.nextInt());

            input.nextLine();
        }
        totalInventoryValue = calculateTotalValue(productPrices, productQuantities);

        stockCounts = countStockStatus(productQuantities);

        mostExpensiveProduct = findMostExpensiveProduct(productNames, productPrices);

        displayReport(
                productNames,
                productPrices,
                productQuantities,
                totalInventoryValue,
                stockCounts[0],
                stockCounts[1],
                mostExpensiveProduct);

        input.close();
    }

    public static Double calculateTotalValue(
            ArrayList<Double> productPrices,
            ArrayList<Integer> productQuantities) {

        Double totalValue = 0.0;

        for (Integer i = 0; i < productPrices.size(); i++) {

            totalValue = totalValue + (productPrices.get(i) * productQuantities.get(i));
        }

        return totalValue;
    }

    public static String checkStockStatus(Integer quantity) {

        if (quantity > 10) {
            return "High Stock";
        } else if (quantity >= 1) {
            return "Available";
        } else {
            return "Out of Stock";
        }
    }

    public static Integer[] countStockStatus(
            ArrayList<Integer> productQuantities) {

        Integer availableProducts = 0;
        Integer outOfStockProducts = 0;

        for (Integer quantity : productQuantities) {

            if (quantity == 0) {
                outOfStockProducts++;
            } else {
                availableProducts++;
            }
        }

        return new Integer[]{
                availableProducts,
                outOfStockProducts
        };
    }

    public static String findMostExpensiveProduct(
            ArrayList<String> productNames,
            ArrayList<Double> productPrices) {

        Double highestPrice = productPrices.get(0);
        String productName = productNames.get(0);

        for (Integer i = 1; i < productPrices.size(); i++) {

            if (productPrices.get(i) > highestPrice) {

                highestPrice = productPrices.get(i);
                productName = productNames.get(i);
            }
        }

        return productName;
    }

    public static void displayReport(

            ArrayList<String> productNames,
            ArrayList<Double> productPrices,
            ArrayList<Integer> productQuantities,
            Double totalInventoryValue,
            Integer availableProducts,
            Integer outOfStockProducts,
            String mostExpensiveProduct) {

        System.out.println("\n========== INVENTORY REPORT ==========");

        for (Integer i = 0; i < productNames.size(); i++) {

            System.out.println("----------------------------------");
            System.out.println("Product Name : " + productNames.get(i));
            System.out.println("Price        : " + productPrices.get(i));
            System.out.println("Quantity     : " + productQuantities.get(i));
            System.out.println("Stock Status : " + checkStockStatus(productQuantities.get(i)));
        }

        System.out.println("----------------------------------");
        System.out.println("Total Inventory Value : " + totalInventoryValue);
        System.out.println("Available Products    : " + availableProducts);
        System.out.println("Out Of Stock Products : " + outOfStockProducts);
        System.out.println("Most Expensive Product: " + mostExpensiveProduct);
    }

}
