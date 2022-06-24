import util.Input;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class GroceryListApp {
    public static void main(String[] args) {
        System.out.println("Welcome to your one-stop shop for creating a grocery list!");
        ArrayList<GroceryItem> yourList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose from the following options: \n");
            System.out.println("1 - Add items to list");
            System.out.println("2 - Edit items on list");
            System.out.println("3 - View shopping list");
            System.out.println("0 - Exit application");
            String userInput = sc.nextLine();
            // Application exits
            if (userInput.equals("0")) {
                System.out.println("\nGoodbye, have a wonderful day!");
                break;
            } else if (userInput.equals("1")) {
                //Sub-menu to add an item by category to grocery list
                while (true) {
                    String name = "";
                    String category = "";
                    int quantity = 0;
                    System.out.println("\nPlease choose a product category: " +
                            "\n1 - Food and Drinks" +
                            "\n2 - Sports and Outdoors" +
                            "\n3 - Entertainment" +
                            "\n0 - Go Back");
                    userInput = sc.nextLine();
                    //Sub-menu to create specific properties of the item, category is already set based on selection
                    switch (userInput) {
                        case "1":
                            category = "Food and Drinks";
                            System.out.println("\nEnter the name of your Food and Drinks item");
                            name = sc.nextLine();
                            System.out.println("Enter the quantity of this item you would like to add");
                            quantity = parseInt(sc.nextLine());
                            System.out.println("You've added: \nName: " + name + "\nCategory: " + category + "\nQuantity: " + quantity);
                            break;
                        case "2":
                            category = "Sports and Outdoors";
                            System.out.println("\nEnter the name of your Sports and Outdoors item:");
                            name = sc.nextLine();
                            System.out.println("Enter the quantity of this item you would like to add:");
                            quantity = parseInt(sc.nextLine());
                            System.out.println("You've added: \nName: " + name + "\nCategory: " + category + "\nQuantity: " + quantity);
                            break;
                        case "3":
                            category = "Entertainment";
                            System.out.println("\nEnter the name of your Entertainment item");
                            name = sc.nextLine();
                            System.out.println("Enter the quantity of this item you would like to add");
                            quantity = parseInt(sc.nextLine());
                            System.out.println("You've added: \nName: " + name + "\nCategory: " + category + "\nQuantity: " + quantity);
                            break;
                        case "0":
                            break;
                    }
                    yourList.add(new GroceryItem(name, category, quantity));
                    break;
                }
            } else if (userInput.equals("2")) {
                System.out.println("Enter the name or category of the item would you like to edit?");
                String itemToBeEdited = sc.nextLine();
                for (GroceryItem groceryItem : yourList) {
                    if (itemToBeEdited.equalsIgnoreCase(groceryItem.getName())) {
                        System.out.println("What would you like to edit?" +
                                "1 - Item Name" +
                                "2 - Item Category" +
                                "3 - Item Quantity" +
                                "0 - Back to main menu");
                    }
                }
            } else if (userInput.equals("3")) {
                System.out.println();
                for (int i = 0; i < yourList.size(); i++) {
                    yourList.get(i).getItemInfo();
                }
            }
        }
    }
}
