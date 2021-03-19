package com.freeit.lesson2.basic;

/*
Задание 14
Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.
 */

import java.util.Arrays;
import java.util.Random;

public class Task14MaxRating {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[random.nextInt(10)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        int max = array[0];
        int min = array[0];

        System.out.println("Массив оценок:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.println("Максимальная оценка: " + max + ", её позиция: " + i);
            }
            if (array[i] == min) {
                System.out.println("Минимальная оценка: " + min + ", её позиция: " + i);
            }
        }
    }
}
