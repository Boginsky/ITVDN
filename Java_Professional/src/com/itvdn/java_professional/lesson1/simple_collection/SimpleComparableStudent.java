package com.itvdn.java_professional.lesson1.simple_collection;

import java.util.Arrays;
import java.util.Comparator;

public class SimpleComparableStudent  {
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }
}


class SimpleComparatorStudent implements Comparator<SimpleComparableStudent> {
    @Override
    public int compare(SimpleComparableStudent o1, SimpleComparableStudent o2) {
//        String firstName1 = o1.firstName;
//        String firstname2 = o2.firstName;
        return o1.getFirstName().compareTo(o2.getFirstName());
//        return firstName1.compareTo(firstname2);
    }
}


//    @Override
//    public int compareTo(SimpleComparableStudent o) {
//
//        if (this.group > o.group){
//            return 1;
//        }else if (this.group < o.group){
//            return -1;
//        }else{
//            return 0;
//        }
//    }


class Main {
    public static void main(String[] args) {

        SimpleComparableStudent[] myStudents = {
                new SimpleComparableStudent("Kirill", 333),
                new SimpleComparableStudent("Andrew", 300),
                new SimpleComparableStudent("Igor", 311),
                new SimpleComparableStudent("Ivan", 322),
        };

        Arrays.sort(myStudents, new SimpleComparatorStudent());

        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }

    }

}
