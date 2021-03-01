package com.itvdn.lesson1.task4;

public class Computer {
    String detail;

    public static void main(String[] args) {

        Computer[] computers = new Computer[5];

        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < 5; i++) {
            computers[i].detail = "detail_" + i;
        }
        for(Computer i : computers){
            System.out.println(i.detail);
        }
    }
}



