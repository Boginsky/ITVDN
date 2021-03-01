package com.itvdn.lesson3.task3;

public class Car extends Vehicle {

    Car(int price,int speed,int yearOfProduction){
        super(price,speed,yearOfProduction);
    }

    void show(){
        System.out.println("Цена: " + price + ". " + "Скорость: " + speed + ". " + "Год производства: " + yearProduction);
    }
}
