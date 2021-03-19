package com.freeit.lesson2.dop;

/*
9)Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class Task9 {
    public static void main(String[] args) {
        int ameb = 1;
        for (int i = 3; i < 25; i += 3) {
            ameb *= 2;
            System.out.println("Через " + i + " час. амеб будет " + ameb);
        }
    }
}
