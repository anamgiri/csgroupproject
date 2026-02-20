/**
 * @author Subash
 * @version 1.0
 * A simple program that helps restock the inventory.
 */
public class FeatureRestock {

    public static void main(String[] args) {
        // 1. Setup sample data
        String[] items = {"Apples", "Bananas", "Oranges"};
        int[] inventory = {5, 5, 5}; 

        System.out.println("--- Restock Process Started ---");
        
        // 2. Test Logic
        restockItem(items, inventory, "Bananas", 5);
        restockItem(items, inventory, "Grapes", 10);
    }

    /**
     * Updates stock for a specific item.
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {
        boolean found = false;

        for (int i = 0; i < names.length; i++) {
            // Null check + Case-insensitive comparison
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println(target + " restocked successfully. New balance: " + stocks[i]);
                found = true;
                break; 
            }
        }

        if (!found) {
            System.out.println("Error: Item '" + target + "' not found in inventory.");
        }
    }
} 