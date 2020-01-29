package com.company;

public class Ellipse implements Shape {
    public Ellipse(double a,double b) {
        this.a = a;
        this.b = b;
    }

    protected final double p = 3.14;
    double a,b;
    @Override
    public void perimeter() {
        System.out.println("Primeter : "+2*p*Math.sqrt((a*a+b*b)/2));
    }

    @Override
    public void area() {
        System.out.println("Area : "+this.a*this.b*this.p);
    }
}
