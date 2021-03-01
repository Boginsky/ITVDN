package com.itvdn.lesson9.additionaltask;

public class Animal {

    String name;
    int age;
    boolean tail;

    Animal(String name,int age, boolean tail){
        this.name = name;
        this.age = age;
        this.tail = tail;
    }

    String precenseTail(){
        if (tail == true){
            return "да";
        }else{
            return "нет";
        }
    }

    @Override
    public String toString(){
        return "Имя: " + this.name + ", возраст: " + this.age + ", хвост: " + precenseTail();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }




}
