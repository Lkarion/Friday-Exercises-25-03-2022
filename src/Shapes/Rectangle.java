package Shapes;

public class Rectangle extends Shape {
    int sideA;
    int sideB;
    static final String objectName = "Rectangle";

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSquare(){
        return sideA*sideB;
    }

    public String toString() {
        return String.format("%s имеет площадь %.2f", this.objectName, getSquare());
    }
}
