package com.freeit.lesson5.human.jacket;

public class WinterJacket implements IJacket{
    private int price;

    public WinterJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Одеваю зимнюю куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю зимнюю куртку");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
