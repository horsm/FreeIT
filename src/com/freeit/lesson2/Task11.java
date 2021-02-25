package com.freeit.lesson2;

import java.util.Scanner;

/*
11)Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите A: ");
        int a = sc.nextInt();
        System.out.print("Введите B: ");
        int b = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < b; i++) {
            sum = sum + a;
        }
        System.out.println("A * B = " + sum);
    }
}
