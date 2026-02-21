import java.util.Scanner;

/**
 * Grocery Management System
 *
 * Demonstrates parallel arrays with a menu system
 * allowing users to view inventory and restock items.
 *
 * @author Anam
 * @version 1.0
 */
public class GroceryManager {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        while (true) {
            System.out.println("\n===== Grocery Inventory Menu =====");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            if (choice == 1) {

                printInventory(itemNames, itemPrices, itemStocks);

            } else if (choice == 2) {

                System.out.print("Enter item name to restock: ");
                String target = scanner.nextLine();

                System.out.print("Enter quantity to add: ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                restockItem(itemNames, itemStocks, target, amount);

            } else if (choice == 3) {

                System.out.println("Exiting program. Goodbye!");
                break;

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    /**
     * Displays inventory items that are not empty.
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        boolean isEmpty = true;

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.printf("%s | $%.2f | Stock: %d%n",
                        names[i], prices[i], stocks[i]);
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("Inventory is empty.");
        }
    }

    /**
     * Restocks an item if it exists.
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

        if (amount <= 0) {
            System.out.println("Restock failed: amount must be greater than zero.");
            return;
        }

        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println(names[i] + " restocked successfully.");
                System.out.println("New quantity: " + stocks[i]);
                return;
            }
        }

        System.out.println("Item not found.");
    }
}
