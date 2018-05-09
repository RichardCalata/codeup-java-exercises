package bookstore;

public class BooksArray {

    public static Book[]findAll(){
            return new Book[]{
                    new Book("book1",40, "Robert"),
                    new Book("book2",40, "Jonathan"),
                    new Book("book3",40, "Dilbert"),
                    new Book("book4",40, "George"),
                    new Book("book5",40, "Stanley"),

            };
    }
}
