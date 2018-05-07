package movies;

import java.util.Scanner;

import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void showMovies() {
        System.out.println("\"showMovies\" method is called.");
        }

    public static void menu() {
        Scanner input = new Scanner(System.in);
        int userChoice;

        do {
            System.out.println("What would you like to do?");

            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            System.out.print("Enter your choice: ");

            userChoice = input.nextInt();

            switch (userChoice) {
                case 0:
                    System.exit(0);
                case 1:
                    showMovies();
                    break;
                case 2:
                    System.out.println("show drama");
                    break;
                case 3:
                    System.out.println("show horror");
                    break;
                case 4:
                    System.out.println("show scifi");
                    break;
                default:
                    System.out.println("A default Message");
                    break;
            }


        } while (false);

    }

    public static void main(String[] args) {
menu();

    }
}
