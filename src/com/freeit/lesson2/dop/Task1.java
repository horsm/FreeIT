package com.freeit.lesson2.dop;

import java.util.Scanner;

/*
1)В переменную записываем число.
        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
        Например, "это однозначное положительное число".
        Достаточно будет определить, является ли число однозначным, "двухзначным или трехзначным и более.
        */

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        int length = String.valueOf(number).length();
        if (number > 0) {
            System.out.println("Это " + length + "-значное положительное число");
        } else if (number < 0) {
            System.out.println("Это " + (length - 1) + "-значное отрицательное число");
        } else {
            System.out.println("Это ноль!");
        }
    }
}
