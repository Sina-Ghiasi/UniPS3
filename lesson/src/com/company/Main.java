package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
         System.out.println("Hi !)");
         Scanner in =new Scanner(System.in);
         System.out.println("Enter lesson : ");
         String s = in.nextLine();
         if(s != null && s.equalsIgnoreCase("advanced programing")){
                Lesson l1 =new Lesson("Advanced programing (3)","math 1 (3)","workshop (1)");
                l1.print();
         }


    }
}
