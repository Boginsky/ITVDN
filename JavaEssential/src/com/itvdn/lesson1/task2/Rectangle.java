package com.itvdn.lesson1.task2;

import java.util.Scanner;

public class Rectangle {


    static double areaCalculator (double side1, double side2){
        double result = side1 * side2;
        return result;
    }

    double perimeterCalculator(double side1, double side2){
        double result = 2*(side1 + side2);
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сторону 1");
        double side1 = in.nextInt();
        System.out.println("Введите сторону 2");
        double side2 = in.nextInt();

        Rectangle rectangle = new Rectangle();

        System.out.println("Площадь прямоугольника равна: " + rectangle.areaCalculator(side1,side2) + ". " + "Периметр прямоугольника равен: " + rectangle.perimeterCalculator(side1,side2) );

    }


}
