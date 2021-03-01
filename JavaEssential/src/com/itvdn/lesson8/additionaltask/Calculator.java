package com.itvdn.lesson8.additionaltask;

public class Calculator {

    void add (int a, int b){
        System.out.println(a + b);
    }

    void sub (int a, int b){
        System.out.println(a - b);
    }

    void mul (int a, int b){
        System.out.println(a * b);
    }

    void div (int a, int b){
        try{
            int c = a / b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
