package bookstore;

public class CustomerArray {

    public static Customer[] findAll(){
        return new Customer[]{
                new Customer("Mary",5),
                new Customer("Tom",4),
                new Customer("Joseph",3),
                new Customer("Oliver",6),
                new Customer("Connor",7),
                new Customer("Violet",8),
                new Customer("John",1),
                new Customer("Mike",3),
                new Customer("Carpentia",0),
        };
    }
}
