package Shapes;

public class Circle extends Shape {
    int radius;


    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getSquare(){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return String.format("%s имеет площадь %.2f", this.name, getSquare());
    }
}
