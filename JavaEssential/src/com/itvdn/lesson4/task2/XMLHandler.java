package com.itvdn.lesson4.task2;

import java.sql.SQLOutput;

public class XMLHandler extends  AbstractHandler {

    void open(){
        System.out.println("Документ открыт в формате XML");
    }

    void create(){
        System.out.println("Документ созданв в формате XML");
    }

    void change(){
        System.out.println("Документ изменен в формате XML");
    }

    void save(){
        System.out.println("Документ сохранен в формате XML");
    }
}
