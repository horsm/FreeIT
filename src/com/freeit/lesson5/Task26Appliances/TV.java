package com.freeit.lesson5.Task26Appliances;

public class TV extends HomeAppliances {
    public TV(String name) {
        super(name);
    }

    @Override
    public void turn(Boolean switcher) {
        if (switcher) {
            System.out.println("Телевизор включен!");
        } else {
            System.out.println("Телевизор выключен!");
        }
    }
}
