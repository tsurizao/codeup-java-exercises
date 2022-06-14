public class ServerNameGenerator {

    public static String generateServerName() {
        String[] adjectiveArr = {"Spunky", "Hungry", "Silly", "Sassy", "Sneaky", "Energetic", "Quiet", "Boisterous", "Vengeful", "Lazy"};
        String[] nounArr = {"Kitten", "Walrus", "Frog", "Cobra", "Mustang", "Hippo", "Eagle", "Monkey", "Sloth", "Ocelot"};
        int randomAdjective = (int) (Math.random() * 10);
        int randomNoun = (int) (Math.random() * 10);
        return (adjectiveArr[randomAdjective] + "-" + nounArr[randomNoun]);
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n" + generateServerName());
    }
}
