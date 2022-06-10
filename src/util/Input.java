package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.println("Enter any string.");
        return scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Enter yes or no or a boolean value.");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("yes") || input.equals("y") || input.equals("true");
    }

    public int getInt(int min, int max) {
        int input = min - 1;
        while (input > max || input < min){
            System.out.println("Enter an integer between " + min + " and " + max + ".");
            input = scanner.nextInt();
        }
        return input;
    }

    public int getInt() {
        System.out.println("Enter an integer.");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double input = min - 1;
        while (input > max || input < min){
            System.out.println("Enter an double between " + min + " and " + max + ".");
            input = scanner.nextDouble();
        }
        return input;
    }

    public double getDouble() {
        System.out.println("Enter a double.");
        return scanner.nextDouble();
    }
}
