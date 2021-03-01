package com.itvdn.lesson6.additionaltask;

public class Calculator {

   int summ(int a, int b){
       return a + b;
   }
   int min (int a, int b){
       return a - b;
   }
   int mult(int a,int b){
       return a * b;
   }
   int div (int a, int b){
       return  a / b;
   }

    public static void main(String[] args) {

       Calculator calc = new Calculator();

        System.out.println("Сложение двух чисел 2 и 2 " + calc.summ(2,2));
        System.out.println("Вычитание двух чисел 2 и 2 " + calc.min(2,2));
        System.out.println("Умножние двух чисел 2 и 2 " + calc.mult(2,2));
        System.out.println("Деление двух чисел 2 и 2 " + calc.div(2,2));

    }

}
