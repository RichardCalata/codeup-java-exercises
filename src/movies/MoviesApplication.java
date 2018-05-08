package movies;

import util.Input;

public class MoviesApplication {

    public static Movie[] movies = MoviesArray.findAll();
    public static Input input = new Input();

    public static void main(String[] args) {
        menu();
    }

    public static void showMovies() {
        for(Movie movie : movies) {
            System.out.println(movie);
        }
    }

        public static void showMovies(String category) {
        for(Movie movie : movies) {
            if(movie.isInCategory(category)) {
                System.out.println(movie);
            }

        }
    }

    public static void menu() {

        do {
            System.out.println("What would you like to do?");

            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");

            System.out.print("Enter your choice: ");
           int  userChoice = getChoice();

            handleChoice(userChoice);
        } while (true);
    }

    public static int getChoice() {
        return input.getInt();
    }

    public static void handleChoice(int userChoice) {

            switch (userChoice) {
                case 0:
                    System.out.println("Thank you. Goodbye.");
                    System.exit(0);
                case 1:
                    showMovies();
                    break;
                case 2:
                    showMovies("animated");
                    break;
                case 3:
                    showMovies("drama");
                    break;
                case 4:
                    showMovies("horror");
                    break;
                case 5:
                    showMovies("scifi");
                default:
                    System.out.println("A default Message");
                    break;
            }
        }
    }



