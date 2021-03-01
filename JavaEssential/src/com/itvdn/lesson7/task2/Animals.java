package com.itvdn.lesson7.task2;

public enum Animals {

    HIPPO(4),DOG(6),CAT(8);

    private int age;


    Animals(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return this.name() + " возрат " + this.age;

    }
}


class Runner{
    public static void main(String[] args) {

        Animals animals = null;

        System.out.println(Animals.HIPPO.toString());
        System.out.println(Animals.DOG.toString());
        System.out.println(Animals.CAT.toString());

    }
}