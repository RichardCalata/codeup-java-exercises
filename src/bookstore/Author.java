package bookstore;

public class Author extends Person {
    int bookWritten;

    public Author(String name, int bookWritten) {
        super(name);
        this.bookWritten = bookWritten;
    }
}
