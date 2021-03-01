package com.itvdn.lesson5.task3;

import java.util.ArrayList;

public class Zoo2 {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add(0, "Слон");
        list.add(1, "Крокодил");
        list.add(2, "Сова");
        list.add(3, "собака");
        list.add(4, "кот");
        list.add(5, "жираф");
        list.add(6, "носорог");
        list.add(7, "бегемоь");

        System.out.println(list);
        list.remove(7);

        list.remove(5);
        list.remove(3);



        System.out.println(list);
        System.out.println(list.size());
    }
}