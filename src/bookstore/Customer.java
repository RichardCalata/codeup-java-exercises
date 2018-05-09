package bookstore;

public class Customer extends Person {
    int booksPurchased;

    public Customer(String name, int booksPurchased) {
        super(name);
        this.booksPurchased = booksPurchased;
    }
}
