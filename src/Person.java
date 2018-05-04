
// Create a Person class inside src
public class Person {

    // Private Name String property /field/variable/atrtribute/instance variable
    private String name;

    public Person(String name){
//        setName(name); //self encapsulation
        this.name = name;
    }

    // returns the person's name //**getter**//
    public String getName(){
        return name;
    }
    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hello "+ name +"!");
    }

    public static void main(String[] args) {

        Person person = new Person("Bingo");
        person.sayHello();
        System.out.println(person.name);
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

    }
}