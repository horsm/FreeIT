package com.freeit.lesson5.robot.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand(int price) {
        this.price = price;
    }

    public SamsungHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Поднялась рука от Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
