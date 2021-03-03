package com.freeit.lesson2.basic;

/*
Задание 11
Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
 */

public class Task11 {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 100 + 2);
        int i;
        boolean isProstoe = false;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isProstoe = true;
                break;
            }
        }
        if (isProstoe) {
            System.out.println("Число " + n + " - составное!");
        } else {
            System.out.println("Число " + n + " - простое!");
        }
    }
}
