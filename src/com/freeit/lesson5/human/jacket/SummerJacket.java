package com.freeit.lesson5.human.jacket;

public class SummerJacket implements IJacket{
    private int price;

    public SummerJacket(int price) {
        this.price = price;
    }

    @Override
    public void putOn() {
        System.out.println("Одеваю летнюю куртку");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю летнюю куртку");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
