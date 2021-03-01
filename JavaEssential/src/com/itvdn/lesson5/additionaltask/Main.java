package com.itvdn.lesson5.additionaltask;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();


        list.add("Татьяна Федоровна");
        list.add("Мищенко");
        list.add("Ия Георгиевна");
        list.add("Вадим");
        list.add("Алла Сергеевна");


        System.out.println("Лучший учитель : " + list.indexOf("Вадим"));
        System.out.println("Худший учитель : " + list.indexOf("Мищенко"));


    }
}
