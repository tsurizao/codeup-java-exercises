import java.util.Scanner;

public class ConsoleRPG {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        //Player stats and enemy stats
        String playerName;
        int playerHealth;
        int playerHealthMax;
        int playerStrength;
        int playerDamage;
        int numberOfPotions = 3;
        int enemyHealth = 100;
        int enemyDamage = 15;

        //Brief game intro
        System.out.println("Where are you?");
        System.out.println("You slowly come to feel at ease as you listen to the sound of waves lapping");
        System.out.println("against the glistening sand.  In the near distance a great mountain stands tall");
        System.out.println("against the shore.  As you gaze upon the great mountain you hear a low voice");
        System.out.println("behind you.  'Ahhh, so this is who the gods have sent.'");
        System.out.println("'I will give you a moment to prepare yourself, the gods can be only have one'");
        System.out.println("'Champion, and I plan on leaving here today as the one.'");

        //Player name creation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your hero: ");
        playerName = sc.nextLine();

        //Player stat dice roll
        //Loop allows user to reroll until stats are satisfactory
        System.out.println(playerName + "'s stats are as follows...");
        while (true) {
            playerHealth = (int) (Math.random() * (100 - 60) + 1) + 60;
            playerHealthMax = playerHealth;
            playerStrength = (int) (Math.random() * (20 - 12) + 1) + 12;
            playerDamage = playerStrength / 2;
            System.out.println("Your stats: \n" + playerHealth + " HP\n" + playerStrength + " STR");
            System.out.println("Enter 'yes' to keep these stats or enter anything else to reroll");
            String userInput = sc.nextLine();
            if (userInput.equals("yes")) {
                break;
            }
        }

        //Game ready prompt
        System.out.println("\nAlas, " + playerName + ", you've entered the Realm of Arkatosh");
        System.out.println("Beware, this place is not as it seems.");
        System.out.println("Enter 'READY' to begin");
        while (true) {
            if (sc.nextLine().toLowerCase().equals("ready")) {
                break;
            }
        }

        System.out.println("As you turn around you see, standing on a giant rock , a giant half-man");
        System.out.println("half-bull looking creature.  The creature jumps down with a resounding");
        System.out.println("thud as it lands on the sand next to you.  He stands two feet taller");
        System.out.println("and appears to weigh three times more than you.  His muscular physique");
        System.out.println("is impossibly perfect.  He walks around you knees bending back behind him");
        System.out.println("like an animal.  'I am Jartaruk of the Stonehide clan, champion of gods.'");
        System.out.println("He tightens his grip on a great bloodstained and battle-worn war axe.");
        System.out.println("'The gods like to test their Champion, and I have been their Champion for");
        System.out.println("'very long time.  I'll make this quick.'  Jartaruk lets out a gut-churning");
        System.out.println("warcry as he charges towards you!");
        System.out.println("Type 'help' to view commands.");

        //This section represents the actual game being played
        while (true) {
            System.out.println("\nPlayer HP: " + playerHealth + " - Enemy HP: " + enemyHealth);
            //This is the first ending, upon reaching zero health, the game is over.
            if (playerHealth <= 0) {
                System.out.println("You stagger, confused as you look down and see Jartaruk's weapon");
                System.out.println("has been impaled through your chest.  Your senses begin to dull as");
                System.out.println("you hear a guttural victory cry from Jartaruk standing over you.");
                System.out.println("everything fades away until there is only is pitch black.");
                System.out.println("You hear a muffle voice saying, 'Nothing personal, great foe.'");
                System.out.println("\n...");
                System.out.println("You wake up in a cold sweat, clenching your chest with your hand, you");
                System.out.println("realize it was just a dream.  It felt so incredibly real!");
                System.out.println("\nGame Over");
                break;
            }
            //Help menu when the command "help" is entered
            System.out.println("\nWhat is your action?: ");
            String userInput = sc.nextLine().toLowerCase();
            if (userInput.equals("help")) {
                System.out.println("a - Attack your enemy with a strength based attack");
                System.out.println("potion - Use one of your 3 vials of health");
                System.out.println("run - Flee from battle");
                continue;
            }
            //Combat is based on a success chance, enemy damage is a fixed 15, player damage is strength
            //stat divided by 2, occurs upon entering "a"
            if (userInput.equals("a")) {
                int attackSuccess = (int) (Math.random() * 10);
                if (attackSuccess > 2) {
                    System.out.println("Your weapon lands a powerful blow upon Jartaruk.");
                    enemyHealth -= playerDamage;
                } else {
                    System.out.println("Your attack narrowly misses Jartaruk.");
                }
                // This is the second ending, upon successfully defeating the enemy
                if (enemyHealth <= 0) {
                    System.out.println("With one final swing of your sword, you land a deadly blow upon Jartaruk.");
                    System.out.println("Jartaruk lets out a death rattle as it falls to the ground in a bloody heap.");
                    System.out.println("Breathing heavily you look to the sky and see a bright light slowly appear.");
                    System.out.println("Gazing upon the light you can make out a humanoid-like figure inside of it");
                    System.out.println("'You've done well, " + playerName + ", let this day be remembered for all eternity.'");
                    System.out.println("'I now dub thee Champion of Arkatosh!  Go!  Let thy future be bright!'");
                    System.out.println("'I shall call upon against when the time is right, when you are to be tested.'");
                    System.out.println("As the thundering voice of light slowly echoes out of existence, you begin to");
                    System.out.println("feel your body floating and a feeling oof nausea comes over you as you're engulfed");
                    System.out.println("in a blinding light... As you feel your sense begin to dull, everything fades...");
                    System.out.println("\n...");
                    System.out.println("Staring at the ceiling of your bedroom, you realize, it was all a dream, Champion");
                    break;
                }
                int enemyAttackSuccess = (int) (Math.random() * 10);
                if (enemyAttackSuccess > 3) {
                    System.out.println("Jartaruk has landed a glancing blow on you!");
                    playerHealth -= enemyDamage;
                } else {
                    System.out.println("You barely dodge Jartaruk's vicious attack");
                }
            }
            //Health potions, removes a potion from inventory and restores 33 hp
            if (userInput.equals("potion")) {
                if (numberOfPotions <= 0) {
                    System.out.println("You do not have any vials of health left.");
                } else {
                    System.out.println("You hastily pull a vial of health from your belt-pouch and quaff it down.");
                    numberOfPotions--;
                    System.out.println("You have " + numberOfPotions + " vials left.");
                    if (playerHealth <= (playerHealthMax - 30)) {
                        playerHealth += 33;
                    } else {
                        playerHealth = playerHealthMax;
                    }
                }
            }
            //If player chooses to escape the battle instead of fight.  This is the third ending.
            if (userInput.equals("run")) {
                System.out.println("\nYou've fled from combat, leaving Jartaruk off in the distance.");
                System.out.println("Looking up at the sky you see a plume of smoke spiraling down toward you.");
                System.out.println("A thundering voice can be heard echoing in the distance...");
                System.out.println("'...How dare you flee in the face of glorious battle.'");
                System.out.println("'Though you live, mortal, the gods will not forgive this act of cowardice.'");
                System.out.println("A giant hand reaches out of the cloud and grabs you.  You feel your senses dull and...");
                System.out.println("\n...");
                System.out.println("Staring at the ceiling of your bedroom, you realize, it was all a dream.  Coward.");
                break;
            }
            //This is a hidden way to leave the game, fourth ending.
            if (userInput.equals("wake")) {
                System.out.println("As dawn breaks the horizon, you wake up to a ray of sunlight filtering through the");
                System.out.println("blinds of your bedroom.  You get out of your bed, knocking something off your night");
                System.out.println("stand.  You pick up a book, 'Jartaruk of Stonehide' and set it back on the night stand.");
                System.out.println("You get up and head off, eager to start your morning.");
                System.out.println("Congratulations, you've found the secret ending.");
                break;
            }
        }
    }
}
