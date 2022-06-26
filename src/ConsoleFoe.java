public class ConsoleFoe {

    private final String name = "Jartaruk";
    private int health = 100;
    private int damage = 15;
    private final String clan = "Stonehide";

    private final String introDescription = "As you turn around you see, standing on a large rock, a giant half-man\nhalf-bull looking creature.  The creature jumps down with a resounding\nthud as it lands on the sand next to you.  He stands two feet taller\nand appears to weigh three times more than you.  His muscular physique\nis impossibly impeccable.  He walks a circle around you knees bending\nback behind him like an animal.  The great creature stops and beings to speak.\n'I am " + name + " of the " + clan + " clan, and champion of the gods.'\n'The gods like to test their Champion, and I have been their Champion for\n'very long time.  Let us make this quick.'\nHe tightens his grip on his great bloodstained and battle-worn war axe.\n" + name + " lets out a gut-churning warcry as he charges towards you!\nYou unsheath your mighty sword and posture yourself for combat.\nType 'help' to view commands.";

    public ConsoleFoe() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
    public String getClan(){
        return clan;
    }

    public String getIntroDescription(){
        return introDescription;
    }
}
