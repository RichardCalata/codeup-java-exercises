package shapes;

public class Rectangle {

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }//shadowing -- assigning a named property on the object with an argument  coming n from a method.

    protected double width;
    protected double length;

    public double getArea(){
        return this.length * this.width;
    }

    public double getPerimeter(){
        return 2*this.length + 2*this.width;
    }

}
