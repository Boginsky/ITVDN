package com.itvdn.lesson1.additionaltask;

public class Address {

    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;


    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }



    public static void main(String[] args) {

        Address address = new Address();

        address.setIndex(55);
        address.setCountry("Belarus");
        address.setCity("Minsk");
        address.setStreet("Gorovca");
        address.setHouse(9);
        address.setApartment(95);
        System.out.println("Индекс равен: " + address.getIndex() + ".  " + "Город: " + address.getCity() + ". " + "Страна: " + address.getCountry());


    }
}
