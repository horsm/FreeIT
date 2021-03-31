package com.freeit.lesson5.сosmodrome;

public class Shuttle implements IStart{
    @Override
    public boolean checkSystem() {
        System.out.println("Предстартовая проверка Шаттла:");
        int check = (int) (Math.random() * 10);
        if (check > 3) {
            System.out.println("Проверка прошла успешно!");
            return true;
        } else {
            System.out.println("Проверка прошла не успешно!");
            return false;
        }
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла!");
    }
}
