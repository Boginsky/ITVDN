package com.itvdn.lesson4.task3;

public class Player implements IPlayable, IPlayble {

    public void play(){
        System.out.println("Начинаю проигрывать запись");
    }

    public void pause(){
        System.out.println("Ставлю запись на паузу");
    }

    public void stop(){
        System.out.println("Запись остановлена");
    }

    public void record(){
        System.out.println("Начата запись");
    }

    public static void main(String[] args) {

        Player player = new Player();

        player.play();
        player.pause();
        player.record();
        player.stop();




    }

}
