package com.freeit.lesson5.Task26Appliances;

public class Fridge extends HomeAppliances{

    public Fridge(String name) {
        super(name);
    }

    @Override
    public void turn(Boolean switcher) {
        if (switcher) {
            System.out.println("Холодильник включен!");
        } else {
            System.out.println("Холодильник включен!");
        }
    }
}
