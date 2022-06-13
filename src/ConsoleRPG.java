import java.util.Scanner;

public class ConsoleRPG {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        //Player stats
        String playerName;
        int playerHealth;
        int playerHealthMax;
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
            playerHealthMax = playerHealth;
            playerStrength = (int) (Math.random() * (20 - 12) + 1) + 12;
            playerDamage = playerStrength / 2;
            System.out.println("Your stats: \n" + playerHealth + " HP\n" + playerStrength + " STR");
            System.out.println("Enter 'yes' to keep these stats or enter anything else to reroll");
            String userInput = sc.nextLine();
            // loop to record player stats
            if (userInput.equals("yes")) {
                break;
            }
        }
        System.out.println("\nAlas, " + playerName + ", you've entered the Realm of Arkatosh");
        System.out.println("Beware, this place is not as it seems.");
        System.out.println("Type 'help' to view commands.");
        System.out.println("Enter 'READY' to begin");

        while (true) {
            if (sc.nextLine().toLowerCase().equals("ready")) {
                break;
            }
        }


        //TODO: need to finish writing out combat mechanics/text output
        while (true) {
            System.out.println("\nPlayer HP: " + playerHealth + " - Enemy HP: " + enemyHealth);
            if (playerHealth <= 0) {
                System.out.println("\nYOU DIED!");
                System.out.println("Game Over");
                break;
            }
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
                int attackSuccess = (int) (Math.random() * 10);
                System.out.println(attackSuccess);
                if (attackSuccess > 2) {
                    System.out.println("Your weapon lands a powerful blow upon your enemy.");
                } else {
                    System.out.println("Your attack narrowly misses the enemy.");
                }
                if(enemyHealth  <= 0){
                    System.out.println("With one final swing of your sword, you land a deadly blow upon the pale orc.");
                    System.out.println("The pale orc lets out a death rattle as it falls to the ground in a bloody heap.");
                    System.out.println("Breathing heavily you look to the sky and see a bright light slowly appear.");
                    System.out.println("Gazing upon the light you can make out a humanoid-like figure inside of it");
                    System.out.println("You've done well, " + playerName + ", let this day be remembered for all eternity.");
                    System.out.println("I now dub thee Champion of Arkatosh!  Go!  Let thy future be bright!");
                    System.out.println("As the thundering voice of light slowly echoes out of existence, you begin to");
                    System.out.println("feel your body floating and a feeling oof nausea comes over you as you're engulfed");
                    System.out.println("in a blinding light... As you feel your sense begin to dull, everything fades...");
                    System.out.println("\n...");
                    System.out.println("Staring at the ceiling of your bedroom, you realize, it was all a dream, Champion");
                    break;
                }
                int enemyAttack = (int) (Math.random() * 10);
                if(enemyAttack > 3){
                    System.out.println("Your enemy has landed a glancing blow on you!");
                    playerHealth -= 10;
                } else{
                    System.out.println("You barely dodge the pale orc's vicious attack");
                }
            }
            if (userInput.equals("potion")) {
                System.out.println("You hastily pull a potion from your belt pouch and quaff it down.");
                System.out.println("You have " + numberOfPotions + " potions left.");
                numberOfPotions--;
                if(playerHealth <= (playerHealthMax - 30)) {
                    playerHealth += 33;
                } else {
                    playerHealth = playerHealthMax;
                }
            }
            if (userInput.equals("run")) {
                System.out.println("\nYou've fled from combat.");
                System.out.println("\nLooking up at the sky you see a plume of smoke spiraling down toward you.");
                System.out.println("A thundering voice can be heard echoing in the distance...");
                System.out.println("'...How dare you flee in the face of glorious battle.'");
                System.out.println("'Though you live, mortal, the gods will not forgive this act of cowardice.'");
                System.out.println("A giant hand reaches out of the cloud and grabs you.  You feel your senses dull and...");
                System.out.println("\n...");
                System.out.println("Staring at the ceiling of your bedroom, you realize, it was all a dream.  Coward.");
                break;
            }
        }
    }
}
