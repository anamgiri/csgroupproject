/**
 * Inventory.java
 *
 * A simple grocery inventory system that demonstrates
 * the use of parallel arrays. Each index represents
 * a single grocery item.
 *
 * @author Anam
 * @version 1.0
 */
public class Inventory {

    /**
     * Initializes inventory arrays and calls the display method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        printInventory(itemNames, itemPrices, itemStocks);
    }

    /**
     * Displays inventory items that are not empty.
     * Iterates through parallel arrays and prints
     * valid entries only.
     *
     * @param names  array of item names
     * @param prices array of item prices
     * @param stocks array of item stock quantities
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {

        for (int i = 0; i < names.length; i++) {

            if (names[i] != null) {
                System.out.println(names[i] + " $" + prices[i] + " Stock: " + stocks[i]);
            } else {
                // empty slot → skip
            }

        }
    }
}
