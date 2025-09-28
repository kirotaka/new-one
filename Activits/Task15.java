package Activits;
import java.lang.Math;

public class Task15 {
    public static void main(String[] args) {
    Circle circle = new Circle("blue", 5);
    Rectangle rectangle = new Rectangle("Red", 10, 15);
        System.out.println("The color of the circle is " + circle.color +
                ", the Area is " + circle.calculateArea() +
                ", and the Perimeter is " + circle.calculatePerimeter());

        System.out.println("The color of the rectangle is " + rectangle.color +
                ", the Area is " + rectangle.calculateArea() +
                ", and the Perimeter is " + rectangle.calculatePerimeter());
    }
}

interface  Shape {
    double calculateArea();
    double calculatePerimeter();
}

abstract class AbstractShape implements Shape {
    String color;
    Double length, width;

    public AbstractShape(String color, Double length, Double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0.0, 0.0); // length and width not used for Circle
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends AbstractShape {
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}





