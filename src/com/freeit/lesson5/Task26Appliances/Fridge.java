package com.freeit.lesson5.Task26Appliances;

public class Fridge extends HomeAppliances{
    private String color;

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fridge(String name, String color) {
        super(name);
        setColor(color);
    }

    @Override
    public String turn(Boolean switcher) {
        if (switcher) {
            return "Холодильник включен!";
        } else {
           return "Холодильник выключен!";
        }
    }
}
