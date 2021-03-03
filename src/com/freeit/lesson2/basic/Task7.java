package com.freeit.lesson2.basic;

/*
Задание 7
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */

public class Task7 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int r = 5;

        double c = Math.sqrt(a * a + b * b);
        System.out.println(c);

        if (r >= c/2) {
            System.out.println("Прямоугольное отверстие можно закрыть");
        } else {
            System.out.println("Прямоугольное отверстие нельзя закрыть");
        }
    }
}
