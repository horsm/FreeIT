package com.freeit.lesson2.dop;

/*
8)Начав тренировки, спортсмен в первый день пробежал 10 км.
Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
Какой суммарный путь пробежит спортсмен за 7 дней?
 */

public class Task8 {
    public static void main(String[] args) {
        double norma = 10;
        double sum = 10;
        for (int i = 1; i < 7; i++) {
            norma = norma * 1.1;
            sum += norma;
        }
        System.out.format("Суммарный путь = %.3f", sum);
    }
}
