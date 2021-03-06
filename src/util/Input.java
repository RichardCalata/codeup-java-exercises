package util;

import java.util.Scanner;

public class Input {
        //private property names scanner
    private Scanner scanner;  //=null

    // 2 options: assign variable directly(inline) -- or constructor --
    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {  //this is a "getter"
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String answer = scanner.nextLine();
        return "y".equalsIgnoreCase(answer)||"yes".equalsIgnoreCase(answer);
    }

    public int getInt(int min, int max){
        int value = getInt();
        if(value < min || value > max) {
            return getInt(min, max);
        }
        return value;
    }

//method overload of getInt above takes in two args as lower and upper limits below is any Int
    public int getInt(){
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
            double value = getDouble();
            if(value < min || value > max) {
                return getDouble( min, max);
            }
            return value;
    }

    public double getDouble(){
        double number = scanner.nextDouble();
        scanner.nextLine();
        return number;
    }



}