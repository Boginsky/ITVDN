package com.itvdn.lesson2.additionaltask;

public class MyArea {

    public static final double PI = 3.14;

    static void areaOfCircle(int radius){
        System.out.println(PI * (radius * radius));
    }

    public static void main(String[] args) {

        areaOfCircle(5);

    }
}
