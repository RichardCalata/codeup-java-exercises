
import java.util.Scanner;

public class MethodsExercises {


public static void main(String[]args){

    Scanner numeral = new Scanner(System.in);

    System.out.println("Enter a number: ");
    double number1 = numeral.nextDouble();
    System.out.println("Enter another Number");
    double number2 = numeral.nextDouble();

    double sum = addition(number1,number2);
    System.out.println("the Sum of " + number1 + " and " + number2 + " is " + sum);
    double diff = subtraction(number1,number2);
    System.out.println("the Difference between " + number1 + " and " + number2 + " is " + diff);
    double product = multiply(number1,number2);
    System.out.println("the Product of " + number1 + " and " + number2 + " is " + product);
    double quotient = divide(number1,number2);
    System.out.println("the Quotient of " + number1 + " divided by " + number2 + " is " + quotient);
    double modu = modulus(number1,number2);
    System.out.println("the Remainder of " + number1 + " divided by " + number2 + " is " + modu);


    System.out.print("Enter a number between 1 and 10: ");
    int userInput = getInteger(1, 10);
    System.out.println(userInput + " IS a number between 1 and 10");


            }

    public static double addition(double a, double b){

             return a+b;
    }

    public static double subtraction(double a, double b) {

        return a - b;
    }

    public static double multiply(double a, double b){

        return a*b;}

    public static double divide(double a, double b){

        return a/b;}

    public static double modulus(double a, double b){

        return a%b;
        }

    public static int getInteger(int min, int max){
        System.out.println("Please input an integer between " + min + " and " + max + ":");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if(number < min || number > max) {
            return getInteger(min, max);
        } else {
            return number;
        }
        }
    }