package com.itvdn.lesson9.task2;

public class Runner {

    public static void main(String[] args) {

        Device device = new Device("Samsung", 450f,"1231SDAF32");
        Device monitor = new Monitor("LG",600,"2312313",1080,720);


        System.out.println(device.toString());
        System.out.println(monitor.toString());
        System.out.println("----------------");
        System.out.println(device.hashCode());
        System.out.println(monitor.hashCode());
        System.out.println("-----------------");
        System.out.println(device.equals(monitor));
    }
}
