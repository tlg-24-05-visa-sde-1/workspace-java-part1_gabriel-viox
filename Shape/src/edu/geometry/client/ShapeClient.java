package edu.geometry.client;

import edu.geometry.Shape;
import edu.geometry.Triangle;
import edu.geometry.Circle;
import edu.geometry.Rectangle;

import java.util.ArrayList;
import java.util.Collection;


public class ShapeClient {

    public static void main(String[] args) {
        Shape t1 = new Triangle(2.0,3.0,4.0,30);
        Shape r1 = new Rectangle(10.0,8.0);
        Shape c1 = new Circle(1.0);

        System.out.println("Triangle area is "+ t1.getArea());
        System.out.println("Circle area is: " + c1.getArea());
        System.out.println("Area of a rectangle is: " + r1.getArea());

        System.out.println("\nPerimeter of rectangle is: " + r1.getPerimeter());
        System.out.println("Perimeter of a circle is:" + c1.getPerimeter());
        System.out.println("Perimeter of a triangle is:" + t1.getPerimeter());
        // Add the areas of shapes into an array
        // Shape[] shapes = new Shape[3];

        Collection<Shape> shapes = new ArrayList<>();
        shapes.add(t1);
        shapes.add(r1);
        shapes.add(c1);


        double totalArea = 0.0;
        double totalPerimeter = 0.0;
        for (Shape shape: shapes){
            double area = shape.getArea();
            double perimeter = shape.getPerimeter();
            System.out.println("\nShape area: " + area);
            System.out.println("Shape Perimeter: " + perimeter);
            totalArea += area; // totalArea = totalArea + area. Goes through array one # at a time and then adds to it to make new total till array has been looped
            totalPerimeter += perimeter; // totalPerimeter is the same explanation as totalArea, just for perimeter.
        }
        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);
    }


}
