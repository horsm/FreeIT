package com.freeit.lesson2;

import java.util.Scanner;

/*
5) Даны 3 целых числа.
Найти количество положительных и отрицательных чисел в исходном наборе.
 */
public class Task5 {
    public static void main(String[] args) {
        int countPos = 0;
        int countNeg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number = sc.nextInt();
        if (number > 0) {
            countPos++;
        } else if (number < 0) {
            countNeg++;
        }
        System.out.print("Введите второе число: ");
        number = sc.nextInt();
        if (number > 0) {
            countPos++;
        } else if (number < 0) {
            countNeg++;
        }
        System.out.print("Введите третье число: ");
        number = sc.nextInt();
        if (number > 0) {
            countPos++;
        } else if (number < 0) {
            countNeg++;
        }

        System.out.println("Количество положительных чисел в исходном наборе: " + countPos);
        System.out.println("Количество отрицательных чисел в исходном наборе: " + countNeg);
    }
}
