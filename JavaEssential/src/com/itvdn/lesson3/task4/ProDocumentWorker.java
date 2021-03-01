package com.itvdn.lesson3.task4;

public class ProDocumentWorker extends DocumentWorker {

    void openDocument(){
        System.out.println("Документ открыт в версии ПРО");
    }

    void editDocument(){
        System.out.println("Документ отредактирован");
    }
    void saveDocument(){
        System.out.println("Документ сохранен в старом формате, сохранение в остльных форматах доступно в версии Эксперт");
    }

}
