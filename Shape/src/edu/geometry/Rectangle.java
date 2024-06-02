package edu.geometry;


public class Rectangle implements Shape {
    private final double length;
    private final double width;

    // constructor needed to initialize the instance variables/attributes for a rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // for good measure
    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public double getPerimeter() {
        return (getLength() * 2) + (getWidth() * 2);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}
