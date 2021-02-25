package com.freeit.lesson2.dop;

/*
12)Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры для значений длин от 1 до 20 дюймов.
1 дюйм = 2,54 см
 */
public class Task12 {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            System.out.println(i + " inch = " + i * 2.54 + " сант.");
        }
    }
}
