package com.freeit.lesson2.basic;

/*
Задание 16
Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями.
 */

import java.util.Arrays;
import java.util.Random;

public class Task16FindSumBetweenMinMax {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        int sum = 0;

        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        for (int j : array) {
            if (j > max) {
                max = j;
            }
            if (j < min) {
                min = j;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                indexMax = i;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
                break;
            }
        }

        if (indexMin < indexMax) {
            for (int i = indexMin + 1; i < indexMax; i++) {
                sum += array[i];
            }
        } else {
            for (int i = indexMax + 1; i < indexMin; i++) {
                sum += array[i];
            }
        }
        System.out.println("Сумма равна: " + sum);
    }
}
