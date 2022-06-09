public class HighLow {
    public static void main(String[] args) {
        highLow();
        highLow();
        highLow();
        highLow();
        highLow();
        highLow();
        highLow();
        highLow();
        highLow();
    }

    public static void highLow() {
        int secretNumber = (int) Math.floor(Math.random() * (100) + 1);

        System.out.println(secretNumber);
    }
}
