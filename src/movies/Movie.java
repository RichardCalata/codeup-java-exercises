package movies;

//Create a class named Movie.
// It should have private fields for name and category,
// and a constructor that sets both of these.
// Create methods to access these properties and change them (getters and setters).

public class Movie {

    private static String name;
    private static String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String name(){

        return name;
    }




}
