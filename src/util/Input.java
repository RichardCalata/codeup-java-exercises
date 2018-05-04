package util;

import java.util.Scanner;

public class Input {
        //privat property names scanner
    private Scanner scanner;  //=null

    // 2 options: assign variable directly(inline) -- or constructor --
    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return null;
    }

    public boolean yesNo(){
        return true;
    }

    public int getInt(){
        return 0;
    }



}