package com.company;

public class Lesson {
    String name;
    String preNeedLesson;
    String hamNiaz;
    public void print (){
        System.out.println("Name :"+ name);
        System.out.println("preneed :"+ preNeedLesson);
        System.out.println("co-requisite :"+ hamNiaz);
        //System.out.println("N :"+ name);
    }

    public Lesson(String name, String preNeedLesson, String hamNiaz) {
        this.name = name;
        this.preNeedLesson = preNeedLesson;
        this.hamNiaz = hamNiaz;
    }
}
