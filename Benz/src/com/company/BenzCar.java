package com.company;

public class BenzCar extends Car {
    String name ="Benz";

    public BenzCar(String model,int topspeed,int price,int mass,int year,double zeroHundred) {
        this.zeroHundred =zeroHundred;
        this.topspeed =topspeed;
        this.model =model;
        this.mass =mass;
        this.price =price;
        this.year =year;
    }
    public void print (){
        System.out.println("Brend : "+name);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Top spped : "+topspeed);
        System.out.println("Zero to hundred time  : "+zeroHundred+" s");
        System.out.println("Mass : "+mass+" kg");
        System.out.println("Price : "+price+" $");
    }
}
