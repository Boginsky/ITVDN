package com.itvdn.java_professional.lesson1.simple_collection;

import java.util.HashMap;
import java.util.Map;

public class SimpleMAp {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("World", 100);
        System.out.println(map.size());
        map.put("World", 150);

        System.out.println(map.size());// перезаписало тк ключи одинаковые(должны быть уникальны)
        System.out.println(map);
        map.put("World1", 160);
        map.put("World2", 120);
        map.put("World3", 130);

        for (Map.Entry<String, Integer> tmp : map.entrySet()){
            System.out.println(tmp.getKey() + " " + tmp.getValue());
        }

    }
}
