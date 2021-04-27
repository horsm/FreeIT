package com.freeit.lesson5.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }
    @Override
    public void step() {
        System.out.println("Нога от Toshiba сделала шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
