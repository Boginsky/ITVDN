package com.itvdn.lesson2.task4;

public class Car {

    int year;
    double speed;
    int weight;
    String color;

    Car() {

    }

    Car(int year) {
this.year = year;
this.speed = 44;
this.weight = 1000;
this.color = "Yellow";
    }

    Car(int year, double speed) {

      this(year,speed,44);
    }

    Car(int year, double speed, int weight) {
this.year = year;
this.speed = speed;
this.weight = weight;
    }

    Car(int year, double speed, int weight,String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}