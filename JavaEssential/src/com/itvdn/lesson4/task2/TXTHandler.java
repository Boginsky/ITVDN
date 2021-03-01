package com.itvdn.lesson4.task2;

public class TXTHandler extends AbstractHandler {

    void open(){
        System.out.println("Документ открыт в формате TXT");
    }

    void create(){
        System.out.println("Документ созданв в формате TXT");
    }

    void change(){
        System.out.println("Документ изменен в формате TXT");
    }

    void save(){
        System.out.println("Документ сохранен в формате TXT");
    }
}


