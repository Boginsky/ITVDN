package com.itvdn.lesson3.task2;

public class Main {

    public static void main(String[] args) {


        ClassRoom classRoom = new ClassRoom( new ExcelentPupil());
        System.out.println("");
        ClassRoom classRoom1 = new ClassRoom( new GoodPupil());
        System.out.println("");
        ClassRoom classRoom2 = new ClassRoom( new BadPupil());
    }
}
