package com.itvdn.lesson8.task2;

public class Worker {

    String name;
    String surname;
    String workingPosition;
    String ageOfEmployment;


    Worker() {
    }

    Worker(String name, String surname, String workingPosition, String ageOfEmployment) {
        this.name = name;
        this.surname = surname;
        this.workingPosition = workingPosition;
        this.ageOfEmployment = ageOfEmployment;
    }

    @Override
    public String toString() {
        return "Имя = " + this.name + " Фамилия = " + this.surname + " Должность = " + this.workingPosition + " Год = " + this.ageOfEmployment;
    }

}