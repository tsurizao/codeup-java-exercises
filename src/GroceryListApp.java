import util.Input;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

public class GroceryListApp {
    public static void main(String[] args) {
        System.out.println("Welcome to your one-stop shop for creating a grocery list!");
        GroceryList yourList = new GroceryList();
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
                System.out.println("Goodbye, have a wonderful day!");
                break;
            } else if (userInput.equals("1")) {
                //Sub-menu to add an item by category to grocery list
                label:
                while (true) {
                    String name = "";
                    String category = "";
                    int quantity = 0;
                    System.out.println("Please choose a product category: ");
                    System.out.println("1 - Food and Drinks");
                    System.out.println("2 - Sports and Outdoors");
                    System.out.println("3 - Entertainment");
                    System.out.println("0 - Go back");
                    userInput = sc.nextLine();
                    //Sub-menu to create specific properties of the item, category is already set based on selection
                    switch (userInput) {
                        case "1":
                            category = "Food and Drinks";
                            System.out.println("Enter the name of your Food and Drinks item");
                            name = sc.nextLine();
                            System.out.println("Enter the quantity of this item you would like to add");
                            quantity = parseInt(sc.nextLine());
                            System.out.println("You've added: ");
                            System.out.println("Name: " + name);
                            System.out.println("Category: " + category);
                            System.out.println("Quantity: " + quantity);
                            break;
                        case "2":
                            category = "Sports and Outdoors";
                            System.out.println("Enter the name of your Sports and Outdoors item");
                            name = sc.nextLine();
                            System.out.println("Enter the quantity of this item you would like to add");
                            quantity = parseInt(sc.nextLine());
                            System.out.println("You've added: ");
                            System.out.println("Name: " + name);
                            System.out.println("Category: " + category);
                            System.out.println("Quantity: " + quantity);
                            break;
                        case "3":
                            category = "Entertainment";
                            System.out.println("Enter the name of your Entertainment item");
                            name = sc.nextLine();
                            System.out.println("Enter the quantity of this item you would like to add");
                            quantity = parseInt(sc.nextLine());
                            System.out.println("You've added: ");
                            System.out.println("Name: " + name);
                            System.out.println("Category: " + category);
                            System.out.println("Quantity: " + quantity);
                            break;
                        case "0":
                            break;
                    }
                    yourList.addItem(new GroceryItem(name, category, quantity));
                }
            } else if(userInput.equals("2")){
                System.out.println("Editing not available at the moment.  Sorry for the inconvenience");
            } else if(userInput.equals("3")){
                yourList.retrieveItems();
            }
        }
    }

    //Instantiation class for grocery item objects for each product
    //Additional methods allow for view item information and setting their fields(editing items in cart)
    public static class GroceryItem {
        private String name;
        private String category;
        private int quantity;

        public GroceryItem() {

        }

        public GroceryItem(String name, String category, int quantity) {
            this.name = name;
            this.category = category;
            this.quantity = quantity;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public void getItemInfo() {
            System.out.println("Name: " + name);
            System.out.println("Category: " + category);
            System.out.println("Quantity: " + quantity);
        }
    }

    //ArrayList that contains all grocery type items
    public static class GroceryList {
        private ArrayList<GroceryItem> items;

        public GroceryList() {
        }

        public GroceryList(ArrayList<GroceryItem> items) {
            this.items = items;
        }

        public void addItem(GroceryItem item) {
            this.items.add(item);
        }

        public void removeItem(GroceryItem item) {
            items.remove(item);
        }

        public void retrieveItems(){
            for(int i = 0; i < items.size();i++){
                System.out.println(items.get(i));
            }
        }
    }
}
