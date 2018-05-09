package bookstore;

public class AuthorsArray {

    public static Author[] findAll() {
        return new Author[]{
                new Author("Robert", 3),
                new Author("Jonathan", 5),
                new Author("George", 2),
                new Author("Stanley", 6),
        };
    }
}
