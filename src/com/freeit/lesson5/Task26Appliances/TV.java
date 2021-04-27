package com.freeit.lesson5.Task26Appliances;

public class TV extends HomeAppliances {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TV(String name, String type) {
        super(name);
        setType(type);
    }

    @Override
    public String turn(Boolean switcher) {
        if (switcher) {
            return "Телевизор включен!";
        } else {
           return "Телевизор выключен!";
        }
    }
}
