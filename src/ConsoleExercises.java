import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        int userInput;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Enter a Numerical Number:");
        userInput = sc.nextInt();
        System.out.println(userInput);

        String userWord1;
        String userWord2;
        String userWord3;
//
//        System.out.println("Enter three words");
//        userWord1 = sc.next();
//        userWord2 = sc.next();
//        userWord3 = sc.next();
//        System.out.println(userWord1 +" "+ userWord2 +" " + userWord3);
////        System.out.println(userWord2);
////        System.out.println(userWord3);

        String mySentence;
        System.out.println("Write a sentence");
        mySentence = sc.nextLine();
        System.out.println(mySentence);

    }
}
