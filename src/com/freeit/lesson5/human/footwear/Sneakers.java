package com.freeit.lesson5.human.footwear;

public class Sneakers implements IFootWear{
    private int price;

    public Sneakers(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Одеваю кроссовок");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю кроссовок");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
