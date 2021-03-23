package com.freeit.lesson5.Task26Appliances;

/*
Создать иерархию классов, описывающих бытовую технику.
Создать несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */

public class Appliances {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("Атлант");
        System.out.print(fridge.name + " - " );
        fridge.turn(true);
        WashingMachine washingMachine = new WashingMachine("Samsung");
        System.out.print(washingMachine.name + " - ");
        washingMachine.turn(false);
        TV tv = new TV("LG");
        System.out.print(tv.name + " - ");
        tv.turn(true);

    }
}
