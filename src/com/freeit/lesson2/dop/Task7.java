package com.freeit.lesson2.dop;

import java.util.Scanner;

/*
7)  В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество программистов: ");
        int number = sc.nextInt();

        if ((number % 100 == 0) || (number % 100 >= 10) && (number % 100 <= 14)) {
            System.out.println(number + " программистов");
        } else if ((number % 10 >= 2) && (number % 10 <= 4)) {
            System.out.println(number + " программиста");
        } else if (number % 10 == 1) {
            System.out.println(number + " программист");
        } else {
            System.out.println(number + " программистов");
        }
    }
}