public class ConsolePlayer {
    private String name;
    private int health;
    private int healthMax;
    private int damage;
    private int numberOfPotions = 3;

    public ConsolePlayer() {

    }

    public ConsolePlayer(String playerName, int playerHealth, int playerDamage) {
        this.name = playerName;
        this.health = playerHealth;
        this.healthMax = playerHealth;
        this.damage = playerDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String playerName) {
        this.name = playerName;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int playerHealth) {
        this.health = playerHealth;
    }

    public int getHealthMax() {
        return healthMax;
    }

    public void setHealthMax(int playerHealthMax) {
        this.healthMax = playerHealthMax;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int playerDamage) {
        this.damage = playerDamage;
    }

    public int getPlayerPotions() {
        return this.numberOfPotions;
    }

    public void setNumberOfPotions(int potions) {
        this.numberOfPotions = potions;
    }
}
