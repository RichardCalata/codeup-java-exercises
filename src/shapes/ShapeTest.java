package shapes;



public class ShapeTest {
    public static void main(String[] args) {
        Measurable box1 = new Rectangle(4,5);
        Square box2 = new Square(5);
        Measurable myShape = new Square(3);

        System.out.println("The Area of myShape is: " + myShape.getArea());
//        System.out.println("The Width of myShape is: " + myShape.getLength());
//        System.out.println("The Width of myShape is: " + myShape.getWidth());
        System.out.println("The Perimeter of myShape is: " + myShape.getPerimeter());
        System.out.println("The area of this shape is: " + box1.getArea());
        System.out.println("The area of this shape is: " + box1.getArea());
        System.out.println("The Perimeter of this shape is: " + box1.getPerimeter());
        System.out.println("The Perimeter of this shape is: " + box2.getPerimeter());
    }

}
//