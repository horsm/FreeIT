package com.freeit.lesson2.basic;

/*
Задание 8
Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
 */

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();

        if ((x % 100 == 0) || (x % 100 >= 10) && (x % 100 <= 14)) {
            System.out.println(x + " рублей");
        } else if ((x % 10 >= 2) && (x % 10 <= 4)) {
            System.out.println(x + " рубля");
        } else if (x % 10 == 1) {
            System.out.println(x + " рубль");
        } else {
            System.out.println(x + " рублей");
        }
    }
}
