package com.itvdn.java_professional.lesson1.additionaltask;

import java.util.Arrays;

public class Animal implements Comparable<Animal> {

    String breed;
    int weight;
    int speed;
    int price;

    public Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    @Override
    public int compareTo(Animal o) {
        int tmp = this.speed - o.speed;

        if (tmp == 0) {
            int tmp1 = this.price - o.price;
            if (tmp1 == 0) {
                int tmp2 = this.weight - o.weight;
                if (tmp2 == 0) {
                    return this.breed.compareTo(o.breed);
                } else {
                    return tmp2;
                }
            } else {
                return tmp1;
            }
        } else {
            return tmp;
        }
    }
}

class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("Cur", 5, 5, 0);
        Animal cat1 = new Animal("Sphinx", 5, 8, 1000);
        Animal cat2 = new Animal("Sphinx", 5, 5, 1000);
        Animal cat3 = new Animal("Sphinx", 5, 8, 1000);

        Animal[] c = {cat, cat1, cat2, cat3};

       Arrays.sort(c);
        for (Animal animal : c) {
            System.out.println(animal);

        }
    }
}
