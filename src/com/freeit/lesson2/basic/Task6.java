package com.freeit.lesson2.basic;

import java.util.Random;

/*
Задание 6
Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class Task6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number =rand.nextInt(1000);
        System.out.println(number);

        if ((int) (Math.log10(number) + 1) == 3) {
            System.out.println("Число трехзначное!");
        } else {
            System.out.println("Число не трехзначное!");
        }
        if (number % 10 == 7) {
            System.out.println("Последняя цифра семерка!");
        } else {
            System.out.println("Последняя цифра не семерка!");
        }
        if (number % 2 == 0) {
            System.out.println("Число четное!");
        } else {
            System.out.println("Число нечетное!");
        }
    }
}
