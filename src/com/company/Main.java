package com.company;

import Shapes.Circle;
import Shapes.Quadrat;
import Shapes.Rectangle;
import Shapes.Shape;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle(4), new Quadrat(5), new Rectangle(4,5)};
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}
