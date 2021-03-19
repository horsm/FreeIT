package com.freeit.lesson2.dop;

import java.util.Scanner;

/*
6) Даны 2 числа. Вывести большее из них
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int numberOne = sc.nextInt();
        System.out.print("Введите второе число: ");
        int numberTwo = sc.nextInt();

        if (numberOne > numberTwo) {
            System.out.println("Большее число: " + numberOne);
        } else if (numberOne < numberTwo) {
            System.out.println("Большее число: " + numberTwo);
        } else {
            System.out.println("Числа одинаковые!");
        }
    }
}
