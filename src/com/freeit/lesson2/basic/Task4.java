package com.freeit.lesson2.basic;

/*
Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.
 */

public class Task4 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10000);
        System.out.println(n);
        int a = n % 10;
        int b = (n - (n % 10)) / 10;
        int a1 = b % 10;
        int c = (b - (b % 10)) / 10;
        int a2 = c % 10;
        int a3 = (c - (c % 10)) / 10;

        System.out.println(a * 1000 + a1 * 100 + a2 * 10 + a3);
    }
}
