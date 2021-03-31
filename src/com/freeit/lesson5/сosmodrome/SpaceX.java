package com.freeit.lesson5.сosmodrome;

public class SpaceX implements IStart{
    @Override
    public boolean checkSystem() {
        System.out.println("Предстартовая проверка SpaceX:");
        boolean check = Math.random() < 0.5;
        if (check) {
            System.out.println("Проверка прошла успешно!");
            return true;
        } else {
            System.out.println("Проверка прошла не успешно!");
            return false;
        }
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX!");
    }
}
