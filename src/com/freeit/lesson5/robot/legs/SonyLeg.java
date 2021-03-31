package com.freeit.lesson5.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога от Sony сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
