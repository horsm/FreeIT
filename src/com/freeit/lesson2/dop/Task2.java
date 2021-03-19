package com.freeit.lesson2.dop;

import java.util.Scanner;

/*
2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
Определить существует ли такой треугольник.
Дано: a, b, c –стороны предполагаемого треугольника.
Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника с такими сторонами не существует.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сторону A: ");
        int a = sc.nextInt();
        System.out.print("Введите сторону B: ");
        int b = sc.nextInt();
        System.out.print("Введите сторону C: ");
        int c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Такой треугольник существует!");
        } else {
            System.out.println("Такой треугольник не существует!");
        }
    }
}
