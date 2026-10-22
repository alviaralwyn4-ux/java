
package ControlFlowPart2;

import java.util.Scanner;

public class WarehouseInventoryScanner {

    static Scanner sc = new Scanner(System.in);

    static int[][] warehouse = {
        {10, 5, -1},
        {3, 0, 8},
        {12, -1, 2}
    };

    static int rows = warehouse.length;
    static int cols = warehouse[0].length;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. Display Inventory");
            System.out.println("2. Total Inventory");
            System.out.println("3. Find First Critically Low Shelf");
            System.out.println("4. Restock a Shelf");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayInventory();
                    break;
                case 2:
                    totalInventory();
                    break;
                case 3:
                    findLowShelf();
                    break;
                case 4:
                    restockShelf();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }

    static void displayInventory() {
        System.out.println("\nWarehouse Inventory:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (warehouse[i][j] == -1) {
                    System.out.print("DAMAGED\t");
                } else {
                    System.out.print(warehouse[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    static void totalInventory() {
        int total = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (warehouse[i][j] == -1) {
                    continue;
                }

                total += warehouse[i][j];
            }
        }

        System.out.println("Total inventory: " + total + " items");
    }

    static void findLowShelf() {
        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (warehouse[i][j] != -1 && warehouse[i][j] < 5) {
                    System.out.println(
                        "First critically low shelf: Row " + (i + 1)
                        + ", Column " + (j + 1)
                        + " (" + warehouse[i][j] + " items)"
                    );

                    found = true;

                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No critically low shelves found.");
        }
    }

    static void restockShelf() {
        System.out.print("Enter row (1-" + rows + "): ");
        int row = sc.nextInt();

        System.out.print("Enter column (1-" + cols + "): ");
        int col = sc.nextInt();

        if (row < 1 || row > rows || col < 1 || col > cols) {
            System.out.println("Invalid shelf location!");
            return;
        }

        if (warehouse[row - 1][col - 1] == -1) {
            System.out.println("Cannot restock a damaged shelf!");
            return;
        }

        int quantity;

        while (true) {
            System.out.print("Enter quantity to add (greater than 0): ");
            quantity = sc.nextInt();

            if (quantity > 0) {
                break;
            }

            System.out.println("Invalid quantity! Please try again.");
        }

        warehouse[row - 1][col - 1] += quantity;

        System.out.println("Restocking successful!");
        System.out.println(
            "Updated shelf quantity: " + warehouse[row - 1][col - 1]
        );
    }
}
