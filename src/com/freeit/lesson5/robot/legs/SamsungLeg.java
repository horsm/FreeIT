package com.freeit.lesson5.robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога от Samsung сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
