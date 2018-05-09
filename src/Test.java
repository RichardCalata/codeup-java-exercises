import java.util.Random;

public class Test {

    public static Random random = new Random();

        public static String getRandomInt() {
            System.out.println(random.nextInt());
            return null;
        }

    public static void main(String[] args) {
        getRandomInt();

    }
}

