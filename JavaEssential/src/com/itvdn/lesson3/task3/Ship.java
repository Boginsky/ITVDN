package com.itvdn.lesson3.task3;

public class Ship extends Vehicle {

    int amoungOfPassengers;
    String port;

    Ship(int price,int speed,int yearOfProduction,int amoungOfPassengers,String port){
        super(price,speed,yearOfProduction);
        this.amoungOfPassengers = amoungOfPassengers;
        this.port = port;
    }

    void show(){
        System.out.println("Цена: " + price + ". " + "Скорость: " + speed + ". " + "Год производства: " + yearProduction + "Порт: " + port + ". " + "Количество пассажиров " + amoungOfPassengers);
    }


}
