package shapes;

import util.Input;
public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        do {
            System.out.println("Enter value of radius");
            double radius = input.getDouble();
            Circle circle = new Circle(radius);
            System.out.printf("The area of a circle is %f%n", circle.getArea());
            System.out.printf("The circumference of a circle is %f%n", circle.getCircumference());
            System.out.println("do you want to play again?");
        } while (input.yesNo());
        System.out.printf("%d circles were created." , Circle.getCircleCount());
    }
}
