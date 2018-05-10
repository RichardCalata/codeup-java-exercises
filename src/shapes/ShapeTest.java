package shapes;



public class ShapeTest {
    public static void main(String[] args) {
        Quadrilateral myShape = new Rectangle(4,5);
        Quadrilateral box2 = new Square(5);

        System.out.println("The Area of box is: " + myShape.getArea());
        System.out.println("The Perimeter of box is: " + myShape.getPerimeter());
        System.out.println("The area of this square is: " + box2.getArea());
        System.out.println("The Perimeter of this square is: " + box2.getPerimeter());
    }

}
