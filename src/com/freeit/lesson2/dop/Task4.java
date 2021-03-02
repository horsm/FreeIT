package com.freeit.lesson2.dop;

/*
4) Даны 3 целых числа.
Найти количество положительных чисел в исходном наборе.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number = sc.nextInt();
        if (number > 0) count++;
        System.out.print("Введите второе число: ");
        number = sc.nextInt();
        if (number > 0) count++;
        System.out.print("Введите третье число: ");
        number = sc.nextInt();
        if (number > 0) count++;

        System.out.println("Количество положительных чисел в исходном наборе: " + count);
    }
}
