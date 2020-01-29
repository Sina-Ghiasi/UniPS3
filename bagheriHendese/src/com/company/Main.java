package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c;
        String s;
        Scanner in =new Scanner(System.in);
        System.out.println("Hi!");
        int a,b;
        while (true){
            System.out.println("------------------------------------------------------\n");
            System.out.println("Choose 1-Rectangle 2-Square 3-Ellipse 4-Circle 5-Exit");
            s =in.nextLine();c =Integer.parseInt(s);
            switch (c){
                case 1:
                    System.out.println("Enter a :");
                    s =in.nextLine();
                    a =Integer.parseInt(s);
                    System.out.println("Enter b :");
                    s =in.nextLine();
                    b =Integer.parseInt(s);
                    Rectangle rectangle =new Rectangle(a,b);
                    rectangle.perimeter();
                    rectangle.area();
                    break;
                case 2:
                    System.out.println("Enter a :");
                    s =in.nextLine();
                    a =Integer.parseInt(s);
                    Square square =new Square(a,a);
                    square.perimeter();
                    square.area();
                    break;
                case 3:
                    System.out.println("Enter a :");
                    s =in.nextLine();
                    a =Integer.parseInt(s);
                    System.out.println("Enter b :");
                    s =in.nextLine();
                    b =Integer.parseInt(s);
                    Ellipse ellipse =new Ellipse(a,b);
                    ellipse.perimeter();
                    ellipse.area();
                    break;
                case 4:
                    System.out.println("Enter r :");
                    s =in.nextLine();
                    a =Integer.parseInt(s);
                    Circle circle =new Circle(a,a);
                    circle.perimeter();
                    circle.area();
                    break;
                    default:
                        System.out.println("Come back soon !)");
                        System.exit(0);
            }
        }
    }
}
