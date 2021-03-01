package com.itvdn.java_professional.lesson1.simple_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class SimpleCollection {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();
        Collection<Integer> list2 = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.add(1)); //true (можем добавить - true, и добавляется в коллекцию
        System.out.println(list.size());
        System.out.println(list2.size());
        list2.addAll(list);
        System.out.println(list2 + " " + list2.size());
//        list2.clear();
//        System.out.println(list2 + " " + list2.size());
//        System.out.println(list2.isEmpty());

        Object[] arr = list2.toArray();


        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println(arr.length);

        Iterator<Integer> al = list.iterator();

        while(al.hasNext()){
            Integer tmp = al.next();
        }
    }
}