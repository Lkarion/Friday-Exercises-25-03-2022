package Shapes;

public class Circle extends Shape {
    int radius;
    static final String objectName = "Circle";

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getSquare(){
        return 2*this.radius*Math.PI;
    }

    public String toString() {
        return String.format("%s имеет площадь %.2f", this.objectName, getSquare());
    }
}
