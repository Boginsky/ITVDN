package com.itvdn.lesson1.task3;

public class Book {


    public static void main(String[] args) {


        Author author = new Author();
        Title title = new Title();
        Content content = new Content();

        author.setNameAuthor("Vasy");
        title.setTitleName("Solaris");
        content.setContent("SDasdadasdad");


        author.show();
        title.show();
        content.show();



    }
}