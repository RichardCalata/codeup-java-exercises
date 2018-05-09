public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
public String getName(){
        String printName = this.name;
        return printName;
};
// changes the name property to the passed value
public void setName(String name){
    this.name = name;

};
// prints a message to the console using the person's name
public void sayHello(){
    System.out.println("Hello " + this.getName());

};

    public static void main(String[] args) {
        Person someOne = new Person("Bob");
        Person someOneNew = new Person("Frank");
        System.out.println(someOne.name);
        System.out.println(someOneNew.name);
        someOne.sayHelloTo(someOneNew);



    }

    private void sayHelloTo(Person person) {
        System.out.println(getName() +" says Hello to "+ person.getName());
    }
}








