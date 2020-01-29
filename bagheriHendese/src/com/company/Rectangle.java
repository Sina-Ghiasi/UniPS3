package com.company;

public class Rectangle implements Shape {
    int a,b;
    public Rectangle(int a,int b) {
        this.a= a;
        this.b= b;

    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter : "+2*(this.a+this.b));
    }

    @Override
    public void area() {
        System.out.println("Area : "+(this.a*this.b));
    }


}
