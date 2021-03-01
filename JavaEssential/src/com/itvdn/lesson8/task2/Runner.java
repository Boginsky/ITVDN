package com.itvdn.lesson8.task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Runner {

    public static boolean isThisDateValid(String dateToValidate, String dateFormat) {
        if (dateToValidate == null) {
            return false;
        }

        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);

        try {
            Date date = sdf.parse(dateToValidate);
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Worker[] workers = new Worker[5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < workers.length; i++) {
            String name = "";
            String surname = "";
            String workingPosition = "";
            String ageOfEmployment = "";

            System.out.println("Имя = ");
            name = in.next();
            System.out.println("Фамилия = ");
            surname = in.next();
            System.out.println("Должность = ");
            workingPosition = in.next();
            System.out.println("Год = ");
            ageOfEmployment = in.next();

            isThisDateValid(ageOfEmployment, "yyyy");


            workers[i] = new Worker(name, surname, workingPosition, ageOfEmployment);

        }

        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].toString());
        }


        System.out.println("Введите значение");
        int value = in.nextInt();
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);

        for (int i = 0; i < workers.length; i++) {
            String year = workers[i].ageOfEmployment;
            int staj = yearNow - Integer.parseInt(year);
            if (staj > value) {
                System.out.println(workers[i].toString());
            }

        }
    }
}


