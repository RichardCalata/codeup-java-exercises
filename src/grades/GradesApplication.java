package grades;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int userInput;
            Student Stephen = new Student("Stephen");

            Stephen.addGrade(100);
            Stephen.addGrade(88);
            Stephen.addGrade(97);
            Stephen.addGrade(89);

            Student John = new Student("John");

            John.addGrade(100);
            John.addGrade(98);
            John.addGrade(92);
            John.addGrade(93);

            Student Thomas = new Student("Thomas");

            Thomas.addGrade(100);
            Thomas.addGrade(98);
            Thomas.addGrade(96);
            Thomas.addGrade(99);

            Student Jennifer = new Student("Jennifer");

            Jennifer.addGrade(100);
            Jennifer.addGrade(98);
            Jennifer.addGrade(98);
            Jennifer.addGrade(100);

            Student Dane = new Student("Dane");

            Dane.addGrade(100);
            Dane.addGrade(100);
            Dane.addGrade(99);
            Dane.addGrade(100);

            Student Monica = new Student("Monica");

            Monica.addGrade(97);
            Monica.addGrade(100);
            Monica.addGrade(98);
            Monica.addGrade(100);

            Student Nestor = new Student("Nestor");

            Nestor.addGrade(24);
            Nestor.addGrade(37);
            Nestor.addGrade(41);
            Nestor.addGrade(90);

        System.out.println(Nestor.grades);
        System.out.println(Nestor.getGradeAverage());

        HashMap<Integer, Student> students = new HashMap<>();

        students.put(1, Stephen);
        students.put(2, John);
        students.put(3, Thomas);
        students.put(4, Dane);
        students.put(5, Jennifer);
        students.put(6, Nestor);
        students.put(7, Monica);


        System.out.println("Welcome");
        System.out.println("Here are some of our student objects!");

        do {
            System.out.println("Which student object would you like to inspect?");
            userInput = input.nextInt();
            if(userInput >7 || userInput < 1){

            System.out.println("Thank you! Have a nice day!");
                System.exit(0);
            }

            Student output = students.get(userInput);
            System.out.println(output.getName() + "'s " + "grades are " + output.grades + " with an average of " + output.getGradeAverage());

        } while (userInput <8 && userInput> 0);


    }
}
