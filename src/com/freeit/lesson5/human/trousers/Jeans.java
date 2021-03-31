package com.freeit.lesson5.human.trousers;

public class Jeans implements ITrousers{
    private int price;

    public Jeans(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Одеваю джинсы");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю джинсы");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
