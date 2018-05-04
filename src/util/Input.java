package util;

import java.util.Scanner;

public class Input {
        //privat property names scanner
    private Scanner scanner;  //=null

    // 2 options: assign variable directly(inline) -- or constructor --
    public Input() {
        scanner = new Scanner(System.in);
    }

    String getString() {
        return scanner.nextLine();
    }

    boolean yesNo(){
        String answer = scanner.nextLine();
        return "y".equalsIgnoreCase(answer)||"yes".equalsIgnoreCase(answer);
    }

    int getInt(int min, int max){
        int value = getInt();
        if(value < min || value > max) {
            return getInt(min, max);
        }
        return value;
    }


    int getInt(){
        return scanner.nextInt();
    }

    double getDouble(double min, double max){
            double value = getInt();
            if(value < min || value > max) {
                return getInt( min, max);
            }
            return value;
    }

    double getDouble(){
        return 0;
    }



}