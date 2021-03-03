package com.freeit.lesson2.basic;

/*
Задание 15
Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать еще один массив).
 */

import java.util.Arrays;
import java.util.Random;

public class Task15ReversMass {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        int temp;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
        System.out.println("Перевернутый массив: ");
        System.out.println(Arrays.toString(array));
    }
}
