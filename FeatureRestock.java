import java.util.Arrays;

/**
 * FeatureRestock
 * Provides functionality to update inventory by restocking an existing item.
 */
public class FeatureRestock {

    /**
     * Restocks an item if it exists in the inventory.
     *
     * @param names   array of item names
     * @param stocks  array of stock quantities
     * @param target  item to restock
     * @param amount  quantity to add
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount) {

        // Validate arrays
        if (names.length != stocks.length) {
            System.out.println("Inventory data error: item list and stock list do not match.");
            return;
        }

        // Validate restock amount
        if (amount <= 0) {
            System.out.println("Restock failed: amount must be greater than zero.");
            return;
        }

        // Search for the item
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println(names[i] + " successfully restocked.");
                System.out.println("New quantity: " + stocks[i]);
                return;  // stop once item is found
            }
        }

        // Item not found
        System.out.println("Restock failed: item \"" + target + "\" not found.");
    }
}
