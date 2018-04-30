import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Numerical Number:");
        userInput = sc.nextInt();
        System.out.println(userInput);

        String userWord1;
        String userWord2;
        String userWord3;

        System.out.println("Enter three words");
        userWord1 = sc.next();
        userWord2 = sc.next();
        userWord3 = sc.next();
        System.out.println(userWord1 +" "+ userWord2 +" " + userWord3);
//        System.out.println(userWord2);
//        System.out.println(userWord3);
        sc.nextLine();
        System.out.println("Write a sentence");
        String mySentence = sc.nextLine();
        System.out.println(mySentence);
//        sc.nextLine();
        System.out.println("What is the room's width?");
        float width = sc.nextFloat();
        System.out.println("What is the room's length?");
        float length =sc.nextFloat();
        System.out.println("Room Width is " + width + " and Room length is " + length);
        System.out.println("the perimeter is " + (width*2+length*2) + "the area is " + length*width);


    }
}
