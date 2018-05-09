package bookstore;

public class Author extends Person {
    int booksWritten;

    public int getBooksWritten() {
        return booksWritten;
    }

    public Author(String name, int booksWritten) {
        super(name);
        this.booksWritten = booksWritten;
    }
}
