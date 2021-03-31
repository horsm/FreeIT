package com.freeit.lesson5.human.trousers;

public class Pants implements ITrousers{
    private int price;

    public Pants(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Одеваю штаны");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
