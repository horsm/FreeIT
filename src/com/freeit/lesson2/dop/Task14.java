package com.freeit.lesson2.dop;

/*
14)Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Все нечетные числа от 1 до 99 включительно:");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
