

import java.util.Arrays;

/**
 * FeatureRestock: Final Complete Version
 * Corrects: Implicit class error, Main method missing, and Loop logic error.
 */
public class FeatureRestock {

    public static void main(String[] args) {
        // Sample data for testing
        String[] items = {"Apples", "Bananas", "Oranges"};
        int[] inventory = {10, 5, 8};

        System.out.println("--- Starting Restock System ---");
        
        // Test 1: Successful restock
        restockItem(items, inventory, "Bananas", 5);
        
        // Test 2: Item not found test
        restockItem(items, inventory, "Grapes", 10);
        
        // Final Status check
        System.out.println("Final Inventory: " + Arrays.toString(inventory));
    }

    /**
     * Finds the target item and updates its stock.
     * Logic is optimized to stop searching once found and report errors correctly.
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        // Validation: Ensure amount is positive
        if (amount <= 0) {
            System.out.println("Error: Restock amount must be greater than 0.");
            return;
        }

        boolean found = false;

        // Loop through the items array
        for (int i = 0; i < names.length; i++) {
            // Check if slot is not empty and matches target (case-insensitive)
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println("SUCCESS: " + target + " restocked. New balance: " + stocks[i]);
                found = true;
                break; // Exit loop immediately once found
            }
        }

        // Logical Fix: Only print this if the loop finished and 'found' is still false
        if (!found) {
            System.out.println("ERROR: Item '" + target + "' was not found in the list.");
        }
    }
}