package util;

import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public boolean yesNo() {
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
        return scanner.nextDouble();
    }
}