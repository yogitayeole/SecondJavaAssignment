package com.example.shapes;
import java.util.*;


 abstract class Shape{
    public abstract void drawShape();
}
class Line extends Shape{

    public void drawShape(){
        System.out.println("Line Drawn");
    }
}
 class Rectangles extends Shape{

    public void drawShape(){
        System.out.println("Rectangles Drawn");
    }
}

 class Cube extends Shape{

    public void drawShape(){
        System.out.println("Cube Drawn");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        /*Shape shape;
        Line line = new Line();
        shape = line;

        Rectangles rectangles = new Rectangles();
        shape = rectangles;

        Cube cube = new Cube();
        shape =  cube;
        */
        Shape line = new Line();
        line.drawShape();

        Shape rectangles = new Rectangles();
        rectangles.drawShape();

        Shape cube = new Cube();
        cube.drawShape();

    }
}

