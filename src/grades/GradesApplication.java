package grades;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String userInput;
            String userResponse;
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


        HashMap<String, Student> students = new HashMap<>();

        students.put("Mr. Robot", Stephen);
        students.put("Toaster", John);
        students.put("Roach", Thomas);
        students.put("N6N-HG", Dane);
        students.put("Duchamp", Jennifer);
        students.put("Rocinante", Nestor);
        students.put("Pavlova", Monica);


        System.out.println("Welcome");

        System.out.println("Here are some of our student objects!");

        for (Map.Entry<String, Student> entry : students.entrySet()) {
            System.out.print(
                  entry.getKey() +  "  " + entry.getValue().getName() + "  |  ");
        }

        do {
            System.out.println("\n \n  Which student object would you like to inspect? (Enter a key or \"0\" to exit.)");
            userInput = input.next();
            if(students.containsKey(userInput)) {

                Student output = students.get(userInput);
                System.out.println(output.getName() + "'s " + "grades are " + output.grades + " with an average of " + output.getGradeAverage());
                System.out.println("Do you want to continue?");
            } else System.out.println("No such student object");

        } while("Y".equalsIgnoreCase(input.next().trim())||"Yes".equalsIgnoreCase(input.next().trim()));
        System.out.println("Thank you! Have a nice day.");
    }
}
