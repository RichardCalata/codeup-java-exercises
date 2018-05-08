
import java.util.Random;

public class ServerNameGenerator {
    public static Random rng = new Random();
    public static String[] adjectives = {"Paracosmic","Cyclic","Orthogonal","Fluid",
            "Quantum","Harmonic","Concentric","Recombinant",
            "Eccentric","Dynamic","Irregular","Flux",
            "Misguided","Wayward","Cavitating","Interplanar"};

    public static String[] nouns = {"Orbit","Optimizer","Oscillator", "Valve",
                                    "Convergence", "Encabulator", "Waveguide","Matrix",
                                    "Instance","Regulator","Plane","Multi-Plexor","Core","Signal"};

    public static String getRandomString(String[] anyword){
        int randomIndex = rng.nextInt(anyword.length);
        return anyword[randomIndex];
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





