package com.freeit.lesson2.basic;

/*
Задание 12
Найдите сумму первых n целых чисел, которые делятся на 3.
 */

public class Task12SumFirstThree {
    public static void main(String[] args) {
        int n = 2;
        int i = 1;
        int sum = 0;
        while (n > 0) {
            if (i % 3 == 0) {
                sum += i;
                n--;
            }
            i++;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
