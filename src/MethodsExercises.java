
import java.util.Scanner;

public class MethodsExercises {


    public static void main(String[] args) {

        Scanner numeral = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double number1 = numeral.nextDouble();
        System.out.println("Enter another Number");
        double number2 = numeral.nextDouble();

        double sum = addition(number1, number2);
        System.out.println("the Sum of " + number1 + " and " + number2 + " is " + sum);
        double diff = subtraction(number1, number2);
        System.out.println("the Difference between " + number1 + " and " + number2 + " is " + diff);
        double product = multiply(number1, number2);
        System.out.println("the Product of " + number1 + " and " + number2 + " is " + product);
        double quotient = divide(number1, number2);
        System.out.println("the Quotient of " + number1 + " divided by " + number2 + " is " + quotient);
        double modu = modulus(number1, number2);
        System.out.println("the Remainder of " + number1 + " divided by " + number2 + " is " + modu);


        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.println(userInput + " IS a number between 1 and 10");

        int nonNegative = nonNegInteger(1,170);

        double factorial = factorial(nonNegative);
        System.out.println(factorial);

        double factorialV2 = factorialRecursion(1,nonNegative);
        System.out.println(factorialV2);

        int roll = dice(20);



    }

    public static double addition(double a, double b) {

        return a + b;
    }

    public static double subtraction(double a, double b) {

        return a - b;
    }

    public static double multiply(double a, double b) {

        return a * b;
    }

    public static double divide(double a, double b) {

        return a / b;
    }

    public static double modulus(double a, double b) {

        return a % b;
    }

    public static int getInteger(int min, int max) {
        System.out.println("Please enter an integer between " + min + " and " + max + ":");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < min || number > max) {
            return getInteger(min, max);
        } else {
            return number;
        }
    }

    public static int nonNegInteger(int min, int max) {
        System.out.println("Please enter a non negative integer no larger than 170: ");
        Scanner scan = new Scanner(System.in);
        int posNumber = scan.nextInt();
        if (posNumber < min  || posNumber > 170) {
            return nonNegInteger(min,max);
        } else {
            return posNumber;
        }
    }

    public static double factorial(int n) {
        double result;

        result = n;

        for (int i = 1; i < n; i++) {
            result *= i;
        }

        return result;
    }

    public static double factorialRecursion(int start, int v) {
        double resultV2;

        resultV2 = v;
        if (v > 0) {

            return start * factorial(v);
        } else
            return resultV2;
    }

    public static int dice(int playerChoice){
        Scanner d20 = new Scanner(System.in);
        System.out.println("Roll a pair of dice. How many sides per die? (4-20)");
        playerChoice = d20.nextInt();
        int d1 = roll(playerChoice);
        System.out.println("First roll " + d1);
        int d2 = roll(playerChoice);
        System.out.println("Second roll " + d2);
        System.out.println("Would you like to roll again? ");
        String rollAgain = d20.next();


        return d1;
    }

    public static int roll(int numberOfSides) {
        return (int) Math.ceil(Math.random() * numberOfSides);
    }


}