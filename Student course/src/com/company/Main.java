package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in =new Scanner(System.in);
        Student s1 =new Student(30,16,2);
        String s;
        System.out.println("Enter name :");
        s =in.nextLine();
        if (s != null && s.equalsIgnoreCase("sina")){
            s1.print();
        }
    }
}
