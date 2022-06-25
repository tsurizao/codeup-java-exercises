import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        System.out.println("\n\n\nLoading BobChat v0.834-beta4323......");
        while (true) {
            if ((System.currentTimeMillis() - startTime) / 1000 == 3) {
                break;
            }
        }
        while (true) {
            if ((System.currentTimeMillis() - startTime) / 1000 == 5) {
                break;
            }
            System.out.println("..........boop...");
            System.out.println("....beep..................");
        }
        System.out.println("\n \n \n Success. \n \n \n");
        System.out.println("Welcome to BobChat, Bob is your best friendly neighborhood lackadaisical teenager.");
        System.out.println("Talk to Bob, ask him a question, yell at him or say nothing at all.");
        System.out.println("You can also say \"done\" to exit the program. \n");

        while (true) {
            String input = sc.nextLine();
            if (input.endsWith("?")) {
                System.out.println("Bob: 'Sure.'");
            } else if (input.endsWith("!")) {
                System.out.println("Bob: 'Whoa, chill out!'");
            } else if (input.trim().equals("")) {
                System.out.println("Bob: 'Fine. Be that way!'");
                // The next line of code was added for fun, if there are any numbers in the string Bob will have a different response
            } else if (input.contains("0") || input.contains("1") || input.contains("2") || input.contains("3") || input.contains("4") || input.contains("5") || input.contains("6") || input.contains("7") || input.contains("8") || input.contains("9")) {
                System.out.println("Bob: 'Dude, numbers, I don't do math, man.'");
            } else if (input.contains("done")) {
                System.out.println("Bob: 'Smell ya later.'");
                System.out.println("Exiting BobChat v0.834-beta4323, have a nice day!");
                break;
            } else {
                System.out.println("Bob: 'Whatever.'");
            }
        }
    }
}
