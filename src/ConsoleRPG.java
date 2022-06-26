import java.util.Scanner;

public class ConsoleRPG {
    public static void main(String[] args) {
        runGame();
    }

    public static void runGame() {
        Scanner sc = new Scanner(System.in);
        ConsolePlayer player = new ConsolePlayer();
        ConsoleFoe enemy = new ConsoleFoe();
        printIntro();
        characterCreation(player);
        playerReadyCheck(player);
        System.out.println(enemy.getIntroDescription());

        //This section represents the actual game being played
        while (true) {
            System.out.println("\nPlayer HP: " + player.getHealth() + " - Enemy HP: " + enemy.getHealth());
            //This is the first ending, upon reaching zero health, the game is over.
            if (player.getHealth() <= 0) {
                printPlayerDeathEnding(enemy);
                break;
            }
            //Help menu when the command "help" is entered
            System.out.println("\nWhat is your action?: ");
            String userInput = sc.nextLine().toLowerCase();
            if (userInput.equals("help")) {
                printHelpMenu();
                continue;
            }
            //Combat is based on a success chance, enemy damage is a fixed 15, player damage is strength
            //stat divided by 2, occurs upon entering "a"
            if (userInput.equals("a")) {
                attackFoe(player, enemy);
                if (enemy.getHealth() <= 0) {
                    break;
                }
                ;
            }
            //Health potions, removes a potion from inventory and restores 33 hp
            if (userInput.equals("potion")) {
                usePotion(player);
            }
            //If player chooses to escape the battle instead of fight.  This is the third ending.
            if (userInput.equals("run")) {
                printRunEnding(enemy);
                break;
            }
            //This is a hidden way to leave the game, fourth ending.
            if (userInput.equals("wake")) {
                printWakeEnding(enemy);
                break;
            }
        }
    }

    // Game mechanics methods
    public static void printIntro() {
        System.out.println("\nYour mind rouses in the midst of dancing lights, colors and");
        System.out.println("sounds.  You feel at ease as you listen to the sound of waves lapping");
        System.out.println("against a glistening beach.  Finally, coming to a tolerable mental state you");
        System.out.println("see in the distance a great mountain standing tall jutting out of the sea.");
        System.out.println("Gazing upon the great mountain you hear a deep-gristly voice behind you...");
        System.out.println("\n'So, this is the hero the Elder Gods have summoned.'");
        System.out.println("\n'I will give you a moment to prepare yourself, mortal.");
        System.out.println("\n'The gods can only have one Champion'");
        System.out.println("\nYou notice a finely-crafted sword strapped to your waste.");
    }

    public static void printRunEnding(ConsoleFoe enemy) {
        System.out.println("\nYou've fled from combat, leaving " + enemy.getName() + " off in the distance.");
        System.out.println("Looking up at the sky you see a plume of smoke spiraling down toward you.");
        System.out.println("A thundering voice can be heard echoing in the distance...");
        System.out.println("'...How dare you flee in the face of glorious battle.'");
        System.out.println("'Though you live, mortal, the gods will not forgive this act of cowardice.'");
        System.out.println("A giant hand reaches out of the cloud and grabs you.  You feel your senses dull and...");
        System.out.println("\n...");
        System.out.println("Staring at the ceiling of your bedroom, you realize, it was all a dream.  Coward.");
    }

    public static void printWakeEnding(ConsoleFoe enemy) {
        System.out.println("As dawn breaks the horizon, you wake up to a ray of sunlight filtering through the");
        System.out.println("blinds of your bedroom.  You get out of your bed, knocking something off your night");
        System.out.println("stand.  You pick up a book, '" + enemy.getName() + " of " + enemy.getClan() + "' and set it back on the night stand.");
        System.out.println("You get up and head off, eager to start your morning.");
        System.out.println("Congratulations, you've found the secret ending.");
    }

    public static void printWinEnding(ConsolePlayer player, ConsoleFoe enemy) {
        System.out.println("With one final swing of your sword, you land a deadly strike upon " + enemy.getName() + ".");
        System.out.println("As you feel your weapon sink deeply into " + enemy.getName() + "'s chest, his");
        System.out.println("massive war axe narrowly misses your throat as it careens passed your body.");
        System.out.println(enemy.getName() + " lets out a death rattle as it falls to the ground in a bloody heap.");
        System.out.println("Breathing heavily and looking at the sky and see a bright light slowly appear.");
        System.out.println("Gazing upon the light you hear thundering voices echoing out.");
        System.out.println("'You've done well, " + player.getName() + ", let this day be remembered.'");
        System.out.println("'We now dub thee Champion of the Elder Gods!  Go!  Let thy future be bright!'");
        System.out.println("'We shall call upon you again to re-enter the arena when the time is right'");
        System.out.println("As the thundering voices slowly echo out of existence, you begin to");
        System.out.println("feel your body floating and a feeling of nausea washes over you as you're engulfed");
        System.out.println("in a blinding light... As your senses begin to dull, everything fades...");
        System.out.println("\n...");
        System.out.println("Staring at the ceiling of your bedroom, you realize, it was all a dream, Champion");
    }

    public static void printPlayerDeathEnding(ConsoleFoe enemy) {
        System.out.println("You stagger, confused as you look down and see " + enemy.getName() + "'s axe");
        System.out.println("has been impaled into your chest.  Your senses begin to dull as");
        System.out.println("you hear a guttural victory cry from " + enemy.getName() + " standing over you.");
        System.out.println("Everything fades away until there is only pitch black.");
        System.out.println("You hear a muffle voice, 'You were an acceptable foe.'");
        System.out.println("\n...");
        System.out.println("You wake up in a cold sweat clenching your chest with your hand.  You");
        System.out.println("realize it was just a dream.  But, it felt so incredibly real?!");
        System.out.println("\nGame Over");
    }

    public static void printHelpMenu() {
        System.out.println("a - Attack your enemy with a strength based attack");
        System.out.println("potion - Use one of your 3 vials of health");
        System.out.println("run - Flee from battle");
    }

    public static void usePotion(ConsolePlayer player) {
        if (player.getPlayerPotions() <= 0) {
            System.out.println("You do not have any vials of health left.");
        } else {
            System.out.println("You hastily pull a vial of health from your belt-pouch and quaff it down.");
            player.setNumberOfPotions(player.getPlayerPotions() - 1);
            System.out.println("You have " + player.getPlayerPotions() + " vials left.");
            if (player.getHealth() <= (player.getHealthMax() - 33)) {
                player.setHealth(player.getHealth() + 33);
            } else {
                player.setHealth(player.getHealthMax());
            }
        }
    }

    public static void attackFoe(ConsolePlayer player, ConsoleFoe enemy) {
        int attackSuccess = (int) (Math.random() * 10);
        if (attackSuccess > 2) {
            System.out.println("Your weapon slashes " + enemy.getName() + ".");
            enemy.setHealth(enemy.getHealth() - player.getDamage());
        } else {
            System.out.println("Your attack misses " + enemy.getName() + ".");
        }
        // This is the second ending, upon successfully defeating the enemy
        if (enemy.getHealth() <= 0) {
            printWinEnding(player, enemy);
            return;
        }
        int enemyAttackSuccess = (int) (Math.random() * 10);
        if (enemyAttackSuccess > 3) {
            System.out.println(enemy.getName() + " lands a powerful strike upon you!");
            player.setHealth(player.getHealth() - enemy.getDamage());
        } else {
            System.out.println("You barely dodge " + enemy.getName() + "'s vicious attack");
        }
    }

    public static void characterCreation(ConsolePlayer player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of your hero: ");
        player.setName(sc.nextLine());
        System.out.println(player.getName() + "'s stats are as follows...");
        while (true) {
            int playerHealth = (int) (Math.random() * (100 - 60) + 1) + 60;
            int playerStrength = (int) (Math.random() * (20 - 12) + 1) + 12;
            System.out.println("Your stats: \n" + playerHealth + " HP\n" + playerStrength + " STR");
            System.out.println("Enter 'yes' to keep these stats or enter anything else to reroll");
            String userInput = sc.nextLine();
            if (userInput.equals("yes")) {
                player.setHealth(playerHealth);
                player.setHealthMax(playerHealth);
                player.setDamage(playerStrength / 2);
                break;
            }
        }
    }

    public static void playerReadyCheck(ConsolePlayer player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAlas, " + player.getName() + ", you've entered the Battlegrounds of the Elder Gods");
        System.out.println("Beware, this place is not as it seems.");
        System.out.println("Enter 'READY' to begin");
        while (true) {
            if (sc.nextLine().equalsIgnoreCase("ready")) {
                break;
            }
        }
    }
}
