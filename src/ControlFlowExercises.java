import java.util.Scanner;
public class ControlFlowExercises {

    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//        int x = 0;
//        do {
//            x = x + 2;
//            System.out.println(x);
//        } while (x < 100);
//
//        int y = 100;
//
//        do {
//            y = y - 5;
//            System.out.println(y);
//        }
//        while (y > 0);

        int count;

//        String output = "";
//        if(count%3==0){output + "Fizz"}
//        if(count%5==0){output + "Buzz"}
//        if(output==""){
//            System.out.println(count);

        for (count = 1; count < 100; count++) {
            if((count % 3 == 0) && (count % 5 == 0)){
                System.out.println("FizzBuzz");
                continue;
            } if( count == 5){
                System.out.println("buzz");
                continue;
            } if (count % 3 == 0) {
                System.out.println("fizz");
            }
            else{
                System.out.println(count);
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int userInt = sc.nextInt();

        System.out.println("Number  |  Square  |  Cube  ");
        for(int q=1;q<=userInt;q++) {
        int square = q*q;
        int cube = q*q*q;
            System.out.println("  " + q + "          " + square + "       " + cube);
        }

        System.out.print("Enter a numerical grade from 0 to 100: ");
        int grade =sc.nextInt();


        if(grade>100||grade<0){
            System.out.println("Invalid");
        }else
        if(grade>=88&&grade<101){
            System.out.println("A");
        }else if(grade<88&&grade>79){
            System.out.println("B");
        }else if(grade<80&&grade>66){
            System.out.println("C");
        }else if(grade<67&&grade>59){
            System.out.println("D");

        }else{
            System.out.println("F");
        }
    }
}
