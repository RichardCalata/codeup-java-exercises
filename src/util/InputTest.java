package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input(); //Instantiation
        System.out.println("enter some text");
        System.out.println("hello " + input.getString());
        System.out.println("Do you want to continue?");
        boolean yesNo = input.yesNo();
        System.out.println(yesNo);
        System.out.println("enter a number between 6 and 19");
        //getInt passes the arguments 6 and 18 as lower and upper limits for get Int method
        int numberInRange = input.getInt(6,18);
        System.out.println(numberInRange);
        System.out.println("enter any number");
        int anyNumber = input.getInt();
        System.out.println(anyNumber);
        System.out.println("Enter a number between 2.5 and 7.9");

        //2.5 and 7.9 are arguments passed for lower and upper limits of getDouble like getInt above
        double doubleInRange =input.getDouble(2.5,7.9);
        System.out.println(doubleInRange);

    }
}