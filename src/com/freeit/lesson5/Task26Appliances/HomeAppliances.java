package com.freeit.lesson5.Task26Appliances;

public abstract class HomeAppliances implements PlugInable{
    String name;

    protected HomeAppliances(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
