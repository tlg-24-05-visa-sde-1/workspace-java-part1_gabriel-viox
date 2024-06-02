package edu.geometry;

public class Triangle implements Shape{
    private final double base;
    private final double height;
    private final double angle;


    //constructor needed to initialize the instance variables/attributes for a triangle
    public Triangle(double base, double height, double angle) {
        this.base = base;
        this.height = height;
        this.angle = angle;
    }

    // getter: write out equation for area of triangle = 1/2 * base * height * angle
    public double getArea() {
        // ToRadians Converts an angle measured in degrees to an approximately equivalent angle measured in radians.
        return 0.5 * getBase() * getHeight() * Math.sin(Math.toRadians(getAngle()));
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getAngle() {
        return angle;
    }
}
