package com.freeit.lesson2.basic;

/*
Задание 5
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
 */

public class Task5 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10000);
        System.out.println(n);
        int a0 = n % 10;
        int b = (n - (n % 10)) / 10;
        int a1 = b % 10;
        int c = (b - (b % 10)) / 10;
        int a2 = c % 10;
        int a3 = (c - (c % 10)) / 10;

        if (((a0 != a1 && a0 != a2 && a0 != a3) && (a1 != a2 && a1 != a3) && (a2 != a3))) {
            System.out.println("Цифры различны!");
        } else {
            System.out.println("Присутствуют одинаковые цифры");
        }
    }
}
