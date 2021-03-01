package com.itvdn.lesson3.task3;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Plane(50,50,60,50,50);
        vehicles[1] = new Car(50,50,50);
        vehicles[2] = new Ship(50,50,50,50,"Alaska");

        vehicles[0].show();
        vehicles[1].show();
        vehicles[2].show();


    }

}
