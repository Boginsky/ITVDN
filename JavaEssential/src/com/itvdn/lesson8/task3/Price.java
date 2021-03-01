package com.itvdn.lesson8.task3;

 class Price {

    String nameOfGood;
    String nameOfStore;
    int price;

    Price(String nameOfGood, String nameOfStore, int price){
        this.nameOfGood = nameOfGood;
        this.nameOfStore = nameOfStore;
        this.price = price;
    }
@Override
    public String toString(){
        return "Наименование товара: " + nameOfGood + ". Название магазина: " + nameOfStore + ". Цена товара: " + price;
    }
}
