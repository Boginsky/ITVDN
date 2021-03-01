package com.itvdn.lesson5.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            System.out.print(++integer +" ");
        }

    }
}