package com.itvdn.lesson9.additionaltask;

public class Runner {

    public static void main(String[] args) {


        Animal cat1 = new Animal("Васька",5,true);
        Animal cat2 = new Animal("Васька",5,true);
        Animal cat3 = new Animal("Васька", 5, false);
        Animal cat4 = cat1;
        System.out.println(cat1.toString());

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.equals(cat4));
        System.out.println(cat1 == cat4);

        System.out.println("------------");

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat4.hashCode());



    }
}
