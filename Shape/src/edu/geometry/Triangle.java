package edu.geometry;

public class Triangle implements Shape{
    private final double side1;
    private final double side2;
    private final double side3;
    private final double angle;



    //constructor needed to initialize the instance variables/attributes for a triangle
    public Triangle(double side1, double side2, double side3, double angle) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.angle = angle;
    }

    // getter: write out equation for area of triangle = 1/2 * base * height * angle
    public double getArea() {
        // ToRadians Converts an angle measured in degrees to an approximately equivalent angle measured in radians.
        return 0.5 * getSide1() * getSide2() * Math.sin(Math.toRadians(getAngle()));
        //Math.sin Returns the trigonometric sine of an angle.
    }

    @Override
    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3(){
        return side3;
    }
    public double getAngle() {
        return angle;
    }
}
