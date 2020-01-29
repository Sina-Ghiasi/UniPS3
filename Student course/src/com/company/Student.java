package com.company;

public class Student {
    int coursePassed;
    int average;
    int term;
    public void print(){
        System.out.println("course passed :"+coursePassed);
        System.out.println("average score :"+average);
        System.out.println("term passed :"+term);
    }

    public Student(int coursePassed, int average, int term) {
        this.coursePassed = coursePassed;
        this.average = average;
        this.term = term;
    }
}
