package com.itvdn.lesson6.task3;

public class Distance {

    double distance;

    void print() {
    }

     static class Converter {

        static double KMtoMile(double distance){
            return  distance * 1.6;
        }


         public static void main(String[] args) {

             System.out.println("4 км в миллях в будет равно: " + Converter.KMtoMile(4));



         }
     }
}
