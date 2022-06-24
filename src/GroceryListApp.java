import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class GroceryListApp {
    public static void main(String[] args) {
        System.out.println("Welcome to your one-stop shop for creating a grocery list!");
        ArrayList<GroceryItem> yourList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        label:
        while (true) {
            // Prints the main menu
            printMainMenu();
            String userInput = sc.nextLine();
            // Application exits via entering  0
            switch (userInput) {
                case "0":
                    exitApplication();
                    break label;
                case "1":
                    //Sub-menu to add an item by category to your grocery list
                    printCategoriesOptions();
                    userInput = sc.nextLine();
                    //Sub-menu utilizes addItem() method to handle item fields and return GroceryItem object
                    switch (userInput) {
                        case "1":
                            yourList.add(addItem(1));
                            break;
                        case "2":
                            yourList.add(addItem(2));
                            break;
                        case "3":
                            yourList.add(addItem(3));
                            break;
                        case "0":
                            break;
                    }
                    break;
                case "2":
                    // Sub-menu to edit an item in your grocery list
                    cycleThroughItems(yourList);
                    break;
                case "3":
                    // Prints all the items and fields in your grocery list
                    printGroceryList(yourList);
                    break;
                case "4":
                    removeItem(yourList);
                    break;
            }
        }
    }

    // Methods created for program as follows
    // Exits the program
    public static void exitApplication() {
        System.out.println("\nGoodbye, have a wonderful day!");
        System.exit(0);
    }

    // Handles creating GroceryItem and fields and also returns the GroceryItem
    public static GroceryItem addItem(int choice) {
        Scanner sc = new Scanner(System.in);
        String category;
        String name;
        int quantity;
        if (choice == 1) {
            category = "Food and Drinks";
        } else if (choice == 2) {
            category = "Sports and Outdoors";
        } else if (choice == 3) {
            category = "Entertainment";
        } else {
            category = "Other";
        }
        System.out.println("\nEnter the name of your " + category + " item:");
        name = sc.nextLine();
        System.out.println("Enter the quantity of this item you would like to add:");
        quantity = parseInt(sc.nextLine());
        System.out.println("You've added: \nName: " + name + "\nCategory: " + category + "\nQuantity: " + quantity);
        return new GroceryItem(name, category, quantity);
    }

    // Handles editing existing items in yourList of GroceryItem
    public static GroceryItem editItem(int choice, GroceryItem item) {
        String newCategory;
        Scanner sc = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("Enter the new name of the item: ");
            item.setName(sc.nextLine());
        } else if (choice == 2) {
            printCategoriesOptions();
//            newCategory = sc.nextLine();
            newCategory = switch (sc.nextLine()) {
                case "1" -> "Food and Drinks";
                case "2" -> "Sports and Outdoors";
                case "3" -> "Entertainment";
                default -> "Other";
            };
            item.setCategory(newCategory);
        } else if (choice == 3) {
            System.out.println("Enter the new quantity of the item: ");
            item.setQuantity(parseInt(sc.nextLine()));
        }
        return item;
    }

    // Handles removing items from your grocery list
    public static void removeItem(ArrayList<GroceryItem> list) {
        System.out.println("Enter the item you would like to remove: ");
        Scanner sc = new Scanner(System.in);
        String itemToDelete = sc.nextLine().toLowerCase();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().toLowerCase().contains(itemToDelete)) {
                System.out.println("Is this the item you would like to remove? (Y/N)");
                list.get(i).getItemInfo();
                String choice = sc.nextLine();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.println(list.get(i).getName() + " has been removed.");
                    list.remove(list.get(i));
                }
            }
        }
    }

    // Handles iterating through your list and finding the item you want to edit
    public static void cycleThroughItems(ArrayList<GroceryItem> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name item would you like to edit?");
        String itemToEdit = sc.nextLine().toLowerCase();
        for (GroceryItem groceryItem : list) {
            if ((groceryItem.getName().toLowerCase().contains(itemToEdit))) {
                groceryItem.getItemInfo();
                printEditOptions();
                int userChoice = parseInt(sc.nextLine());
                editItem(userChoice, groceryItem);
            }
        }
    }

    // Prints the main options menu
    public static void printMainMenu() {
        System.out.println("""
                Please choose from the following options:\s
                1 - Add items to list
                2 - Edit items on list
                3 - View shopping list
                4 - Delete item from list
                0 - Exit application""");
    }

    // Prints the item category menu.
    public static void printCategoriesOptions() {
        System.out.println("""
                Please choose a product category:
                1 - Food and Drinks
                2 - Sports and Outdoors
                3 - Entertainment
                0 - Go Back""");
    }

    // Prints the edit options menu.
    public static void printEditOptions() {
        System.out.println("""
                What would you like to edit?
                1 - Item Name
                2 - Item Category
                3 - Item Quantity
                0 - Skip""");
    }

    public static void printGroceryList(ArrayList<GroceryItem> list) {
        System.out.println();
        for (GroceryItem groceryItem : list) {
            groceryItem.getItemInfo();
        }
    }
}
