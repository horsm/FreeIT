package com.freeit.lesson2;

import java.util.Scanner;

/*
3) Дано целое число.
Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2.
Если нулевым, то заменить его на 10. Вывести полученное число
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();

        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else
            number = 10;

        System.out.println("Полученное число: " + number);
    }
}
