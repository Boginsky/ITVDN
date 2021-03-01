package com.itvdn.lesson4.task2;

public class DOCHandler extends AbstractHandler {

    void open(){
        System.out.println("Документ открыт в формате DOC");
    }

    void create(){
        System.out.println("Документ созданв в формате DOC");
    }

    void change(){
        System.out.println("Документ изменен в формате DOC");
    }

    void save(){
        System.out.println("Документ сохранен в формате DOC");
    }
}


