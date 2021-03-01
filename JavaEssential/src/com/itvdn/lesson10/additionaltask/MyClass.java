package com.itvdn.lesson10.additionaltask;

public class MyClass<T> {

    public static <T> void factoryMethod(T t1) {
        System.out.println(t1.toString());
    }

    public static <T> String method(T t2){
        return t2.toString();
    }




    public static void main(String[] args) {

        factoryMethod(new Double(44.0));



        MyClass<String> s = new MyClass<>();

        System.out.println(s.method("Sda"));
    }

}