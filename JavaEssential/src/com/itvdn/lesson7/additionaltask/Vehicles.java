package com.itvdn.lesson7.additionaltask;

import com.itvdn.lesson6.task2.Vehicle;

public enum Vehicles {ONE, TWO, THREE, FOUR, FIVE}
    class Main {
        public static void main (String [] args) {
            Vehicles n1 = Vehicles.ONE;
            Vehicles n2 = Vehicles.ONE;
            if (n1 == n2) {System.out.print ("true");}
            else {System.out.print ("false");}
            System.out.println (Vehicles.FIVE.ordinal ());
        }
    }
