package com.freeit.lesson2.basic;

/*
Задание 13
Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */

import java.util.Arrays;
import java.util.Random;

public class Task13MassFindMaxMin {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[10];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("Последовательность случайных чисел:");
        System.out.println(Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }
}
