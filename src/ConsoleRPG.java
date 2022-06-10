import java.util.Scanner;

public class ConsoleRPG {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        //Player stats
        String playerName;
        int playerHealth;
        int playerStrength = 0;
        int playerDamage;

        int numberOfPotions = 3;
        int enemyHealth = 100;
        int enemyDamage = 15;

        //Player name creation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your hero: ");
        playerName = sc.nextLine();

        //Player stat creation
        System.out.println(playerName + "'s stats are as follows...");
        while (true) {
            playerHealth = (int) (Math.random() * (100 - 60) + 1) + 60;
            playerStrength = (int) (Math.random() * (20 - 12) + 1) + 12;
            playerDamage = playerStrength / 2;
            System.out.println("Your stats: \n" + playerHealth + " HP\n" + playerStrength + " STR");
            System.out.println("Type 'yes' to keep stats or type anything else to reroll");
            String userInput = sc.nextLine();
            // loop to record player stats
            if (userInput.equals("yes")) {
                break;
            }
        }
        System.out.println("\nAlas, " + playerName + ", you've entered the Realm of the Arcane Order");
        System.out.println("Beware, you know not of what you will encounter.");
        System.out.println("Type 'help' to view commands.");
        System.out.println("Enter 'READY' to begin");

        while (true) {
            if(sc.nextLine().toLowerCase().equals("ready")){
                break;
            }
        }


        //TODO: need to finish writing out combat mechanics/text output
        while (true) {
            System.out.println("Player HP: " + playerHealth);
            System.out.println("Enemy HP: " + enemyHealth);
            String userInput = sc.nextLine().toLowerCase();
            System.out.println("\nWhat is your action?: ");
            if (userInput.equals("help")) {
                System.out.println("attack - Attack your enemy with a strength based attack");
                System.out.println("potion - Use a vial of health");
                System.out.println("run - Flee from battle");
                continue;
            }
            if (userInput.equals("attack")) {
                System.out.println("attacking");
            }
            if (userInput.equals("potion")) {
                System.out.println("drinking potion");
            }
            if (userInput.equals("run")) {
                System.out.println("\nYou've fled from combat.");
                System.out.println("\nYou look up at the sky and cloud spiraling downwards toward you you.");
                System.out.println("A thundering voice can be heard echoing off in the distance...");
                System.out.println("'...How dare you flee in the face of glorious battle.'");
                System.out.println("'Though you live, mortal, the gods will not forgive this act of cowardice.'");
                System.out.println("A giant hand reaches out of the cloud and grabs you.");
                System.out.println("\n...");
                System.out.println("Staring at the ceiling of your bedroom, you realize, it was all a dream.");
                break;
            }
        }
    }
}
