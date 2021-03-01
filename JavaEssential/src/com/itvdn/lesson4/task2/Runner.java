package com.itvdn.lesson4.task2;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Введите тип вашего документа");
        Scanner in = new Scanner(System.in);
        String type = in.next();

        switch (type){
            case("DOC"):
                AbstractHandler example = new DOCHandler();
                example.create();
                example.open();
                example.change();
                example.save();
                break;
            case("XML"):
                AbstractHandler example1 = new XMLHandler();
                example1.create();
                example1.open();
                example1.change();
                example1.save();
                break;
            case("TXT"):
                AbstractHandler example2 = new TXTHandler();
                example2.create();
                example2.open();
                example2.change();
                example2.save();
                break;
        }


    }

}
