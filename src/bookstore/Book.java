package bookstore;

public class Book extends Product {
    String author;

    public Book(String title, double price, String author) {
        super(title, price);
        this.author = author;
    }
}
