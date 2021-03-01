package com.itvdn.lesson10.task3;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary<TKey, TValue> {

    Map<TKey,TValue> dictionary = new HashMap<>();

    public Map<TKey, TValue> getDictionary(){
        return dictionary;
    }

    public void addMeth(TKey key,TValue value){
        dictionary.put(key, value);
    }

    public TValue indexOfMeth(TKey key){
        return dictionary.get(key);
    }


    public int count(){
        return dictionary.size();
    }


    public static void main(String[] args) {

        MyDictionary<String,String> dict = new MyDictionary<>();
        dict.addMeth("1","String");
        dict.addMeth("2","String1");


        System.out.println(dict.getDictionary());
        System.out.println(dict.count());
        System.out.println(dict.indexOfMeth("2"));
    }
}
