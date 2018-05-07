
import java.util.Random;

public class ServerNameGenerator {
    public static Random rng = new Random();
    public static String[] adjectives = {"Paracosmic","Cyclic","Orthogonal","Fluid",
            "Quantum","Harmonic","Concentric",
            "Eccentric","Dynamic","Irregular",
            "Misguided","Wayward"};

    public static String[] nouns = {"Orbit","Optimzer","Oscillator", "Valve",
                                    "Convergence", "Encabulator", "Waveguide","Matrix",
                                    "Instance","Regulator","Plane","Multi-Plexor"};

    public static String getRandomString(String[] args){
        int randomIndex = rng.nextInt(args.length);
        return args[randomIndex];
    }

    public static String getServerName() {
        return String.format(
                "%s-%s",
                getRandomString(adjectives),
                getRandomString(nouns)
        );
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: " + getServerName());
    }
}





