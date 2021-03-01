package com.itvdn.lesson6.task2;

public class Vehicle {

    void print(){

        System.out.println("Класс Vehicle");
    }
    class Wheel{
        void print(){
            System.out.println("Класс Wheel");
        }

    }

    class  Door{
        void print(){
            System.out.println("Класс Door");
        }

    }


    public static void main(String[] args) {

        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();




    }
}
