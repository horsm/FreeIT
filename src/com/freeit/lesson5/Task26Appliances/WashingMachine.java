package com.freeit.lesson5.Task26Appliances;

public class WashingMachine extends HomeAppliances{
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public WashingMachine(String name, int power) {
        super(name);
        setPower(power);
    }

    @Override
    public String turn(Boolean switcher) {
        if (switcher) {
            return "Стиральная машина включена!";
        } else {
            return "Стиральная машина выключена!";
        }
    }
}
