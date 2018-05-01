import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        String message = input.next();
        String bobSays;
        boolean isQuestion = message.endsWith("?");
        boolean isYelling = message.equals(message.toUpperCase());
        boolean isEmpty = message.trim().equals("");

        if(isQuestion){
            bobSays = "Sure.";

        }
        else if(isEmpty){
            bobSays = "Fine, be that way.";

        }else if(isYelling){
            bobSays = "Whoa, Chill out, man. ";

        }else{ bobSays = "Whatever";

        }
        System.out.println(bobSays);

    }
}
