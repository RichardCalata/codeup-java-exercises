package bookstore;

public class BookStore {

    public static void main(String[] args) {

        Author author = new Author("Bob", 3);
        Book book = new Book("Book1",23,"Bob");
        System.out.println(author.getName() + " has written " + author.getBooksWritten() + " books");
        System.out.println(book.getTitle() + ", by " + book.getAuthor() + "; Price: $" + book.getPrice());

    }
}
