package shapes;



public class ShapeTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4,5);
        Rectangle box2 = new Square(5);

        System.out.println("The Area of box is: " + box1.getArea());
        System.out.println("The Perimeter of box is: " + box1.getPerimeter());
        System.out.println("The area of this square is: " + box2.getArea());
        System.out.println("The Perimeter of this square is: " + box2.getPerimeter());
    }

}
