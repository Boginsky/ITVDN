package com.itvdn.lesson10.task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {

    List<T> list = new ArrayList<T>();

    void addMeth(T t){
        list.add(t);
    }

    public int indexOfMeth(T t){
        return list.indexOf(t);
    }

    public  List<T> getList(){
        return list;
    }

    public int count(){
        return list.size();
    }

    public static void main(String[] args) {


        MyList<String> list = new MyList<>();
        list.addMeth("asddas");
        System.out.println(list.getList());
        System.out.println(list.indexOfMeth("asddas"));
        System.out.println(list.count());

    }



}
