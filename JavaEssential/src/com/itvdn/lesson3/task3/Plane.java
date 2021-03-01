package com.itvdn.lesson3.task3;

public class Plane extends Vehicle {

    int height;
    int amountOfPassengers;

    Plane(int price,int speed,int yearOfProduction, int height, int amountOfPassengers){
        super(price,speed,yearOfProduction);
        this.height = height;
        this.amountOfPassengers = amountOfPassengers;
    }

    void show(){
        System.out.println("Я самолет с:  Цена: " + price + ". " + "Скорость: " + speed + ". " + "Год производства: " + yearProduction + "Высота: " + height + ". " + "Количество пассажиров " + amountOfPassengers);
    }

}
