package com.freeit.lesson5.Task26Appliances;

/*
Создать иерархию классов, описывающих бытовую технику.
Создать несколько объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.
 */

public class Appliances {
    public static void main(String[] args) {
        Fridge fridge = new Fridge("Атлант", "черный");
        System.out.println("Холодильник: " + fridge.name + ", цвет: " + fridge.getColor() +
                ". Состояние: " + fridge.turn(false));

        WashingMachine washingMachine = new WashingMachine("Samsung", 1000);
        System.out.println("Стиральная машина: " + washingMachine.name + ", мощность: " + washingMachine.getPower() + " Вт." +
                " Состояние: " + washingMachine.turn(true));

        TV tv = new TV("LG", "ЖК");
        System.out.println("Телевизор: " + tv.name + ", тип: " + tv.getType() +
                ". Состояние: " + tv.turn(false));
    }
}
