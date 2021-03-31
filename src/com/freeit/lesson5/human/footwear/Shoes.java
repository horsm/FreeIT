package com.freeit.lesson5.human.footwear;

public class Shoes implements IFootWear{
    private int price;

    public Shoes(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Одеваю туфли");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю туфли");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
