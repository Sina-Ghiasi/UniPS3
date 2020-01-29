package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hi !)");
        Scanner in =new Scanner(System.in);
        System.out.println("Enter brand : ");
        String s = in.nextLine();

        if(s != null && s.equalsIgnoreCase("Benz")){
            BenzCar b1 =new BenzCar("sls550",280,33000,1800,2015,3.5);
            b1.print();
            BenzCar b2 =new BenzCar("amg",210,25000,2000,2015,3.5);
            b2.print();
            BenzCar b3 =new BenzCar("s300",250,45000,2200,2015,3.5);
            b3.print();
            BenzCar b4 =new BenzCar("glk",230,32000,2300,2015,3.5);
            b4.print();
            BenzCar b5 =new BenzCar("cls550",240,35000,1700,2015,3.5);
            b5.print();

        }
        else {
            System.out.println("Wrong");
        }

    }

}

