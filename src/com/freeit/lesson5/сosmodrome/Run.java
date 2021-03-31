package com.freeit.lesson5.сosmodrome;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrom cosmodrom = new Cosmodrom();
        cosmodrom.launch(new Shuttle());
        System.out.println("------------------------------");
        cosmodrom.launch(new SpaceX());
        System.out.println("------------------------------");
        cosmodrom.launch(new Enterprise());
    }
}
