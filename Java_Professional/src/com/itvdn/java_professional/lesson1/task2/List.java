package com.itvdn.java_professional.lesson1.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class List {
    public static void main(String[] args) {


        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) {
            Random random = new Random();
            int a = random.nextInt(10);
            arr.add(a);
        }
        Iterator<Integer> iterator = arr.iterator();

        while(iterator.hasNext()){
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }
    }
}
