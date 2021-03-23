package com.freeit.lesson5.Task26Appliances;

public class WashingMachine extends HomeAppliances{
    public WashingMachine(String name) {
        super(name);
    }

    @Override
    public void turn(Boolean switcher) {
        if (switcher) {
            System.out.println("Стиральная машина включена!");
        } else {
            System.out.println("Стиральная машина выключена!");
        }
    }
}
