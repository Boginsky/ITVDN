package com.itvdn.lesson3.additionaltask;

public class Printer {
    public static final String ANSI_GREEN = "\u001B[32m";
    void print(String value){
        System.out.println(ANSI_GREEN + value  + ANSI_GREEN);
    }

}
