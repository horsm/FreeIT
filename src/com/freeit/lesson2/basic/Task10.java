package com.freeit.lesson2.basic;

/*
Задание 10
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class Task10 {
    public static void main(String[] args) {
        long factorial = 1;

        for (int i = 10; i <= 15; i++) {
            int x = i;

            while(x != 0) {
                if (x == 0) {
                    factorial = 1;
                } else {
                    factorial = factorial * x;
                    x--;
                }
            }
            System.out.println("Факториал числа " + i + " = " + factorial);
            factorial = 1;
        }
    }
}
