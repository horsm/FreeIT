package com.freeit.lesson5.сosmodrome;

import java.util.Random;

public class Enterprise implements IStart{
    Random random = new Random();
    @Override
    public boolean checkSystem() {
        System.out.println("Предстартовая проверка Энтерпрайз:");
        boolean check = random.nextBoolean();
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
        System.out.println("Двигатели Энтерпрайз запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Энтерпрайз!");
    }
}
