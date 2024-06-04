package edu.geometry;

public class Circle implements Shape{
    private final double radius;

    // constructor needed to initialize the instance variables/attributes for a circle
    public Circle(double radius) {
        this.radius = radius;
    }


    // Area of a Circle: A=πr2
    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getRadius() {
        return radius;
    }

//    public void setRadius(double radius) {
//        this.radius = radius;
//    }
}
