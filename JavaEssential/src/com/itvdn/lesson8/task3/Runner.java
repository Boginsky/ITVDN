package com.itvdn.lesson8.task3;



import java.util.Scanner;

public class Runner {

    public static void main(String[] args) throws Exception {

        Price[] price = new Price[2];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < price.length ; i++) {
            String nameOfGood;
            String nameOfStore;
            int price1;

            System.out.println("Наименование товара: ");
            nameOfGood = in.next();
            System.out.println("Название магазина: ");
            nameOfStore = in.next();
            System.out.println("Цена товара");
            price1 = in.nextInt();

            price[i] = new Price(nameOfGood,nameOfStore,price1);
        }

        for (int i = 0; i < price.length; i++) {
            System.out.println(price[i].toString());
        }

        System.out.println("Введите название магазина: ");
        String name = in.next();

        for (int i = 0; i < price.length; i++) {
            String name1 = price[i].nameOfStore;
            if(name.equals(name1)){
                System.out.println(name);
            }else{
                throw new Exception();
            }
        }
    }
}
