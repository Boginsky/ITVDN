package com.itvdn.lesson3.task4;

public class ExpertDocumentWorker extends ProDocumentWorker {

    void openDocument(){
        System.out.println("Документ открыт в версии ЭКСПЕРТ");
    }

    void editDocument(){
        System.out.println("Документ отредактирован");
    }
    void saveDocument(){
        System.out.println("Документ сохранен в новом формате");
    }




}
