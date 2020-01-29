package com.company;

public class Circle extends Ellipse {
    public Circle(double a, double b) {
        super(a, b);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter : "+2*a*p);
    }

    @Override
    public void area() {
        super.area();
    }
}
